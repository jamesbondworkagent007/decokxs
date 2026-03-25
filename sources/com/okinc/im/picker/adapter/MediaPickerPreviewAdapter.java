package com.okinc.im.picker.adapter;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.im.picker.adapter.MediaPickerPreviewAdapter;
import com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class MediaPickerPreviewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public ActionBar KWHzl;
    public final List<MediaPickerPreviewViewModel.MediaItem> AEQbTJ = new ArrayList();
    public final Map<Integer, Integer> copydefault = new LinkedHashMap();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oBy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MediaPickerPreviewAdapter.AEQbTJ();
        }
    });

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void KWHzl(@NotNull Uri uri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<Integer, Integer> OLrzqt() {
        return this.copydefault;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.picker.adapter.MediaPickerPreviewAdapter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void OLrzqt(@NotNull List<? extends MediaPickerPreviewViewModel.MediaItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        notifyDataSetChanged();
    }

    public final void OLrzqt(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault.clear();
        this.copydefault.putAll(map);
    }

    public final void EZpvd() {
        notifyItemRangeChanged(0, getItemCount(), "KEY_VIDEO_POSITIONS");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ViewType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType IMAGE = new ViewType("IMAGE", 0);
        public static final ViewType VIDEO = new ViewType("VIDEO", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{IMAGE, VIDEO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        MediaPickerPreviewViewModel.MediaItem mediaItem = this.AEQbTJ.get(i);
        if (mediaItem instanceof MediaPickerPreviewViewModel.MediaItem.ImageItem) {
            return ViewType.IMAGE.ordinal();
        }
        if (mediaItem instanceof MediaPickerPreviewViewModel.MediaItem.VideoItem) {
            return ViewType.VIDEO.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ViewGroup.MarginLayoutParams copydefault() {
        return (ViewGroup.MarginLayoutParams) this.OLrzqt.getValue();
    }

    public static final ViewGroup.MarginLayoutParams AEQbTJ() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == ViewType.IMAGE.ordinal()) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setLayoutParams(copydefault());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return new TaskDescription(this, imageView);
        }
        if (i == ViewType.VIDEO.ordinal()) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(copydefault());
            VideoView videoView = new VideoView(viewGroup.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            videoView.setLayoutParams(layoutParams);
            frameLayout.addView(videoView);
            return new StateListAnimator(this, frameLayout, videoView);
        }
        throw new IllegalArgumentException("Invalid view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.contains("KEY_VIDEO_POSITIONS") && (viewHolder instanceof StateListAnimator)) {
            ((StateListAnimator) viewHolder).KWHzl();
        } else {
            onBindViewHolder(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof TaskDescription) {
            MediaPickerPreviewViewModel.MediaItem mediaItem = this.AEQbTJ.get(i);
            Intrinsics.copydefault(mediaItem, "");
            ((TaskDescription) viewHolder).OLrzqt((MediaPickerPreviewViewModel.MediaItem.ImageItem) mediaItem);
            return;
        }
        if (viewHolder instanceof StateListAnimator) {
            MediaPickerPreviewViewModel.MediaItem mediaItem2 = this.AEQbTJ.get(i);
            Intrinsics.copydefault(mediaItem2, "");
            ((StateListAnimator) viewHolder).EZpvd((MediaPickerPreviewViewModel.MediaItem.VideoItem) mediaItem2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final ImageView EZpvd;
        public final /* synthetic */ MediaPickerPreviewAdapter copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull MediaPickerPreviewAdapter mediaPickerPreviewAdapter, ImageView imageView) {
            super(imageView);
            Intrinsics.checkNotNullParameter(imageView, "");
            this.copydefault = mediaPickerPreviewAdapter;
            this.EZpvd = imageView;
        }

        public final void OLrzqt(@NotNull MediaPickerPreviewViewModel.MediaItem.ImageItem imageItem) {
            Intrinsics.checkNotNullParameter(imageItem, "");
            Glide.KWHzl(this.EZpvd).EZpvd(imageItem.AEQbTJ()).EZpvd(this.EZpvd);
        }
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final VideoView AEQbTJ;
        public final /* synthetic */ MediaPickerPreviewAdapter KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull MediaPickerPreviewAdapter mediaPickerPreviewAdapter, @NotNull FrameLayout frameLayout, VideoView videoView) {
            super(frameLayout);
            Intrinsics.checkNotNullParameter(frameLayout, "");
            Intrinsics.checkNotNullParameter(videoView, "");
            this.KWHzl = mediaPickerPreviewAdapter;
            this.AEQbTJ = videoView;
        }

        public final void EZpvd(@NotNull final MediaPickerPreviewViewModel.MediaItem.VideoItem videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "");
            VideoView videoView = this.AEQbTJ;
            final MediaPickerPreviewAdapter mediaPickerPreviewAdapter = this.KWHzl;
            videoView.setVideoURI(videoItem.AEQbTJ());
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.oBz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    MediaPickerPreviewAdapter.StateListAnimator.copydefault(mediaPickerPreviewAdapter, this, mediaPlayer);
                }
            });
            videoView.setOnTouchListener(new View.OnTouchListener() { // from class: o.oBA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return MediaPickerPreviewAdapter.StateListAnimator.KWHzl(this.OLrzqt, view, motionEvent);
                }
            });
            videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: o.oBE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    return MediaPickerPreviewAdapter.StateListAnimator.OLrzqt(mediaPickerPreviewAdapter, videoItem, mediaPlayer, i, i2);
                }
            });
        }

        public static final void copydefault(MediaPickerPreviewAdapter mediaPickerPreviewAdapter, StateListAnimator stateListAnimator, MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
            Integer num = mediaPickerPreviewAdapter.OLrzqt().get(Integer.valueOf(stateListAnimator.getBindingAdapterPosition()));
            int iIntValue = num != null ? num.intValue() : 0;
            pUU.OLrzqt("VideoView: adapterPosition: " + stateListAnimator.getBindingAdapterPosition() + " | vidPosition: " + iIntValue);
            if (iIntValue > 0) {
                mediaPlayer.seekTo(iIntValue);
            }
        }

        public static final boolean KWHzl(StateListAnimator stateListAnimator, View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (stateListAnimator.AEQbTJ.isPlaying()) {
                stateListAnimator.AEQbTJ.pause();
            } else {
                stateListAnimator.AEQbTJ.start();
            }
            return true;
        }

        public static final boolean OLrzqt(MediaPickerPreviewAdapter mediaPickerPreviewAdapter, MediaPickerPreviewViewModel.MediaItem.VideoItem videoItem, MediaPlayer mediaPlayer, int i, int i2) {
            ActionBar actionBar = mediaPickerPreviewAdapter.KWHzl;
            if (actionBar == null) {
                return false;
            }
            actionBar.KWHzl(videoItem.AEQbTJ());
            return false;
        }

        public final void KWHzl() {
            int currentPosition = this.AEQbTJ.getCurrentPosition();
            pUU.OLrzqt("VideoView: adapterPosition: " + getBindingAdapterPosition() + " | saved position: " + currentPosition);
            this.KWHzl.copydefault.put(Integer.valueOf(getBindingAdapterPosition()), Integer.valueOf(currentPosition));
        }
    }
}
