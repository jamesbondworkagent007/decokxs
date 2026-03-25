package o;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28805khh {
    public static /* synthetic */ SimpleExoPlayer setupPlayerViewFromUrl$default(PlayerView playerView, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return KWHzl(playerView, str, z, function1);
    }

    public static final SimpleExoPlayer KWHzl(@NotNull PlayerView playerView, @NotNull java.lang.String str, boolean z, Function1<? super PlayerView, Unit> function1) {
        Intrinsics.checkNotNullParameter(playerView, "");
        Intrinsics.checkNotNullParameter(str, "");
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(playerView.getContext()).build();
        Intrinsics.checkNotNullExpressionValue(simpleExoPlayerBuild, "");
        playerView.setVisibility(0);
        playerView.setPlayer(simpleExoPlayerBuild);
        MediaItem mediaItemFromUri = MediaItem.fromUri(android.net.Uri.parse(str));
        Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "");
        simpleExoPlayerBuild.setMediaItem(mediaItemFromUri);
        simpleExoPlayerBuild.setRepeatMode(0);
        if (function1 != null) {
            simpleExoPlayerBuild.addListener(new Activity(playerView, function1));
        }
        simpleExoPlayerBuild.prepare();
        if (z) {
            simpleExoPlayerBuild.play();
        }
        return simpleExoPlayerBuild;
    }

    /* JADX INFO: renamed from: o.khh$Activity */
    public static final class Activity implements Player.EventListener {
        public final /* synthetic */ PlayerView KWHzl;
        public final /* synthetic */ Function1<PlayerView, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.google.android.exoplayer2.ui.PlayerView, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(PlayerView playerView, Function1<? super PlayerView, Unit> function1) {
            this.KWHzl = playerView;
            this.copydefault = function1;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i) {
            android.view.Window window;
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.copydefault.invoke(this.KWHzl);
            } else {
                android.content.Context contextOLrzqt = C58196ywi.OLrzqt(this.KWHzl.getContext());
                android.app.Activity activity = contextOLrzqt instanceof android.app.Activity ? (android.app.Activity) contextOLrzqt : null;
                if (activity == null || (window = activity.getWindow()) == null) {
                    return;
                }
                window.addFlags(128);
            }
        }
    }

    public static final void EZpvd(@NotNull SimpleExoPlayer simpleExoPlayer) {
        Intrinsics.checkNotNullParameter(simpleExoPlayer, "");
        simpleExoPlayer.stop();
        simpleExoPlayer.release();
    }
}
