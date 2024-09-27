package com.gnomon.reddittest.ui.screen.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.gnomon.reddittest.R
import com.gnomon.reddittest.data.models.RedditPost

@Composable
fun PostItem(
    post: RedditPost,
    modifier: Modifier = Modifier,
    showBody: Boolean,
    onClick: (post: RedditPost) -> Unit = {},
) {
    Row(
        modifier =
        modifier
            .fillMaxSize()
            .padding(PaddingValues(horizontal = 4.dp, vertical = 16.dp))
            .clickable { onClick(post) },
    ) {
        Likes(post)
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = post.title,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 6.dp),
            )
            if (post.image != null) {
                AsyncImage(
                    model = post.image,
                    contentDescription = post.title,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .padding(18.dp, 0.dp, 0.dp, 8.dp)
                        .fillMaxWidth(),
                )
            }
            if (showBody) {
                post.body?.let {
                    Text(
                        text = post.body,
                        modifier = Modifier.padding(
                            PaddingValues(
                                horizontal = 0.dp,
                                vertical = 8.dp
                            )
                        ),
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    Icons.Default.MailOutline,
                    contentDescription = stringResource(id = R.string.comment)
                )
                Text(
                    text = pluralStringResource(
                        id = R.plurals.comments,
                        count = post.commentCount,
                        post.commentCount
                    ),
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
        }
    }
}

@Composable
fun Likes(post: RedditPost) {
    Column(
        modifier = Modifier
            .width(55.dp)
            .padding(0.dp, 0.dp, 4.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            Icons.Default.KeyboardArrowUp,
            contentDescription = stringResource(id = R.string.like),
        )
        Text(
            text = "${post.upVotes}",
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
        )
        Icon(
            Icons.Default.KeyboardArrowDown,
            contentDescription = stringResource(id = R.string.dislike),
        )
    }
}
