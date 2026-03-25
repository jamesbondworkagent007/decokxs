package com.okinc.im.picker.viewmodel;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaPickerPreviewViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<TaskDescription> AEQbTJ;
    public final SavedStateHandle EZpvd;
    public final Context OLrzqt;
    public final StateFlow<TaskDescription> gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final String KWHzl = MediaPickerPreviewViewModel.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> AEQbTJ() {
        return this.gEmmrt;
    }

    @yCM
    public MediaPickerPreviewViewModel(@NotNull Context context, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = context;
        this.EZpvd = savedStateHandle;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(TaskDescription.Activity.OLrzqt);
        this.AEQbTJ = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final List<Uri> OLrzqt() {
        List<Uri> list = (List) this.EZpvd.get("ARG_URI_LIST");
        return list == null ? yDY.AhwBna() : list;
    }

    public final List<Uri> EZpvd() {
        List<Uri> list = (List) this.EZpvd.get("ARG_ORIGINAL_LIST");
        return list == null ? yDY.AhwBna() : list;
    }

    public final List<MediaItem> copydefault() {
        List<MediaItem> list = (List) this.EZpvd.get("ARG_MEDIA_ITEMS");
        return list == null ? yDY.AhwBna() : list;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class MediaItem implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel.MediaItem.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ MediaItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Uri AEQbTJ();

        private MediaItem() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ImageItem extends MediaItem {
            public static final Parcelable.Creator<ImageItem> CREATOR = new Creator();
            public final Uri OLrzqt;

            public static final class Creator implements Parcelable.Creator<ImageItem> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ImageItem createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ImageItem((Uri) parcel.readParcelable(ImageItem.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ImageItem[] newArray(int i) {
                    return new ImageItem[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = imageItem.OLrzqt;
                }
                return imageItem.OLrzqt(uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel.MediaItem
            public Uri AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageItem OLrzqt(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "");
                return new ImageItem(uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageItem) && Intrinsics.EZpvd(this.OLrzqt, ((ImageItem) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ImageItem(uri=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.OLrzqt, i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageItem(@NotNull Uri uri) {
                super(null);
                Intrinsics.checkNotNullParameter(uri, "");
                this.OLrzqt = uri;
            }
        }

        public static final class VideoItem extends MediaItem {
            public static final Parcelable.Creator<VideoItem> CREATOR = new Creator();
            public final Uri KWHzl;

            /* JADX INFO: loaded from: classes18.dex */
            public static final class Creator implements Parcelable.Creator<VideoItem> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VideoItem createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new VideoItem((Uri) parcel.readParcelable(VideoItem.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VideoItem[] newArray(int i) {
                    return new VideoItem[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ VideoItem copy$default(VideoItem videoItem, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = videoItem.KWHzl;
                }
                return videoItem.KWHzl(uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel.MediaItem
            public Uri AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final VideoItem KWHzl(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "");
                return new VideoItem(uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VideoItem) && Intrinsics.EZpvd(this.KWHzl, ((VideoItem) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "VideoItem(uri=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.KWHzl, i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoItem(@NotNull Uri uri) {
                super(null);
                Intrinsics.checkNotNullParameter(uri, "");
                this.KWHzl = uri;
            }
        }
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends TaskDescription {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends TaskDescription {
            public final List<MediaItem> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel$TaskDescription$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = application.AEQbTJ;
                }
                return application.OLrzqt(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<MediaItem> EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull List<? extends MediaItem> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(mediaItems=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel$MediaItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Application(@NotNull List<? extends MediaItem> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }
    }

    public final void AEQbTJ(@NotNull List<? extends Uri> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.set("ARG_URI_LIST", list);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MediaPickerPreviewViewModel$initList$1(this, list, null), 3, null);
    }

    public final void EZpvd(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        List<? extends Uri> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) OLrzqt());
        listFJNWhG.remove(uri);
        AEQbTJ(listFJNWhG);
    }

    public final boolean AEQbTJ(int i) {
        return copydefault().get(i) instanceof MediaItem.VideoItem;
    }

    public final void AEQbTJ(int i, boolean z) {
        List listCopydefault;
        Uri uriAEQbTJ = copydefault().get(i).AEQbTJ();
        if (z && !EZpvd().contains(uriAEQbTJ)) {
            listCopydefault = CollectionsKt___CollectionsKt.copydefault((Collection<? extends Uri>) EZpvd(), uriAEQbTJ);
        } else {
            List<Uri> listEZpvd = EZpvd();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listEZpvd) {
                if (!Intrinsics.EZpvd((Uri) obj, uriAEQbTJ)) {
                    arrayList.add(obj);
                }
            }
            listCopydefault = arrayList;
        }
        this.EZpvd.set("ARG_ORIGINAL_LIST", listCopydefault);
    }

    public final boolean KWHzl(int i) {
        return EZpvd().contains(copydefault().get(i).AEQbTJ());
    }
}
