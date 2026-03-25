package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.view.gallery.image.GalleryImageSource;
import com.okinc.planet.biz_content.input.GenericInputViewModel$activityImageUpload$1;
import com.okinc.planet.biz_content.input.GenericInputViewModel$addShareImageAndUpload$1;
import com.okinc.planet.biz_content.input.GenericInputViewModel$startUpload$3;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
import com.okinc.planet_api.ActivityCardImage;
import com.okinc.planet_api.RichShareToFeedImage;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47546tsE extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<java.util.List<ImageItem>> AEQbTJ;
    public final StateFlow<StateListAnimator> AYXKKw;
    public final StateFlow<java.lang.String> AhwBna;
    public final MutableStateFlow<java.lang.String> KWHzl;
    public final MutableStateFlow<StateListAnimator> OLrzqt;
    public final StateFlow<java.util.List<ImageItem>> copydefault;
    public final SingleFileUploadUseCase gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47546tsE() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<ImageItem>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:com.okinc.planet.domain.usecase.SingleFileUploadUseCase:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.planet.domain.usecase.SingleFileUploadUseCase:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:38) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.gmHjFq():com.okinc.planet.domain.usecase.SingleFileUploadUseCase A[MD:():com.okinc.planet.domain.usecase.SingleFileUploadUseCase (m), WRAPPED] (LINE:38)) : (r1v0 com.okinc.planet.domain.usecase.SingleFileUploadUseCase))
 A[MD:(com.okinc.planet.domain.usecase.SingleFileUploadUseCase):void (m)] (LINE:37) call: o.tsE.<init>(com.okinc.planet.domain.usecase.SingleFileUploadUseCase):void type: THIS */
    public /* synthetic */ C47546tsE(SingleFileUploadUseCase singleFileUploadUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.gmHjFq() : singleFileUploadUseCase);
    }

    public C47546tsE(@NotNull SingleFileUploadUseCase singleFileUploadUseCase) {
        Intrinsics.checkNotNullParameter(singleFileUploadUseCase, "");
        this.gEmmrt = singleFileUploadUseCase;
        MutableStateFlow<java.util.List<ImageItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.KWHzl = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<StateListAnimator> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow3);
    }

    /* JADX INFO: renamed from: o.tsE$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tsE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<? extends android.net.Uri> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        java.util.List<ImageItem> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.AEQbTJ.getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ImageItem(null, (android.net.Uri) it.next(), null, null, null, null, null, null, null, null, null, 2045, null));
        }
        listFJNWhG.addAll(arrayList);
        copydefault(listFJNWhG);
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            startUpload$default(this, context, (ImageItem) it2.next(), null, 4, null);
        }
    }

    public final void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull ImageItem imageItem, @NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(imageItem, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        imageItem.setBitmapKey(C48948ufM.copydefault.AEQbTJ(fragmentActivity, bitmap));
        OLrzqt(fragmentActivity, imageItem, java.lang.Boolean.TRUE);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.util.List<RichShareToFeedImage> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GenericInputViewModel$addShareImageAndUpload$1(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.AEQbTJ.getValue()), this, list, context, null), 3, null);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setValue(str);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(imageItem, "");
        startUpload$default(this, context, imageItem, null, 4, null);
    }

    public final void OLrzqt(@NotNull final ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(imageItem, "");
        java.util.List<ImageItem> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.AEQbTJ.getValue());
        if (C56406yEe.AEQbTJ(listFJNWhG, new Function1() { // from class: o.tsF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C47546tsE.AEQbTJ(imageItem, (ImageItem) obj));
            }
        })) {
            copydefault(listFJNWhG);
        }
    }

    public static final boolean AEQbTJ(ImageItem imageItem, ImageItem imageItem2) {
        Intrinsics.checkNotNullParameter(imageItem2, "");
        return Intrinsics.EZpvd((java.lang.Object) imageItem2.getId(), (java.lang.Object) imageItem.getId());
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, int i, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            android.widget.ImageView imageView = childAt != null ? (android.widget.ImageView) childAt.findViewById(C47501trL.TaskDescription.Th) : null;
            if (imageView != null) {
                arrayList.add(imageView);
            }
        }
        java.util.ArrayList<GalleryImageSource> arrayList2 = new java.util.ArrayList<>();
        for (ImageItem imageItem : this.AEQbTJ.getValue()) {
            if (imageItem.getLocalUri() != null) {
                arrayList2.add(GalleryImageSource.Companion.AEQbTJ(imageItem.getLocalUri()));
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getBitmapKey())) {
                C48948ufM c48948ufM = C48948ufM.copydefault;
                java.lang.String bitmapKey = imageItem.getBitmapKey();
                Intrinsics.copydefault((java.lang.Object) bitmapKey);
                android.graphics.Bitmap bitmapKWHzl = c48948ufM.KWHzl(bitmapKey);
                if (bitmapKWHzl != null) {
                    arrayList2.add(GalleryImageSource.Companion.OLrzqt(fragmentActivity, bitmapKWHzl));
                } else {
                    GalleryImageSource.ActionBar actionBar = GalleryImageSource.Companion;
                    java.lang.String remoteUrl = imageItem.getRemoteUrl();
                    if (remoteUrl == null) {
                        remoteUrl = "";
                    }
                    arrayList2.add(actionBar.copydefault(remoteUrl));
                }
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getFilePath())) {
                java.lang.String filePath = imageItem.getFilePath();
                Intrinsics.copydefault((java.lang.Object) filePath);
                java.io.File file = new java.io.File(filePath);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    arrayList2.add(GalleryImageSource.Companion.AEQbTJ(filePath));
                } else {
                    GalleryImageSource.ActionBar actionBar2 = GalleryImageSource.Companion;
                    java.lang.String remoteUrl2 = imageItem.getRemoteUrl();
                    if (remoteUrl2 == null) {
                        remoteUrl2 = "";
                    }
                    arrayList2.add(actionBar2.copydefault(remoteUrl2));
                }
            } else {
                GalleryImageSource.ActionBar actionBar3 = GalleryImageSource.Companion;
                java.lang.String remoteUrl3 = imageItem.getRemoteUrl();
                if (remoteUrl3 == null) {
                    remoteUrl3 = "";
                }
                arrayList2.add(actionBar3.copydefault(remoteUrl3));
            }
        }
        C43160rjz.KWHzl.EZpvd(fragmentActivity, "publisher", arrayList2, i, arrayList.toArray(new java.lang.Object[0]), C56424yEw.AYXKKw(C56390yDp.OLrzqt("cornerRadius", 8)));
    }

    public final void copydefault(java.util.List<ImageItem> list) {
        this.AEQbTJ.setValue(list);
    }

    public static /* synthetic */ void startUpload$default(C47546tsE c47546tsE, android.content.Context context, ImageItem imageItem, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        c47546tsE.OLrzqt(context, imageItem, bool);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull ImageItem imageItem, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(imageItem, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getRemoteUrl())) {
            EZpvd(imageItem, new Function1() { // from class: o.tsC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47546tsE.KWHzl((ImageItem) obj);
                }
            });
            return;
        }
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            EZpvd(imageItem, new Function1() { // from class: o.tsA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47546tsE.copydefault((ImageItem) obj);
                }
            });
        }
        java.lang.String id = imageItem.getId();
        pUU.KWHzl("PlanetUpload", "startUpload id=" + id + " uri=" + imageItem.getLocalUri());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GenericInputViewModel$startUpload$3(id, this, imageItem, context, null), 3, null);
    }

    public static final ImageItem KWHzl(ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(imageItem, "");
        return imageItem.copy((2039 & 1) != 0 ? imageItem.id : null, (2039 & 2) != 0 ? imageItem.localUri : null, (2039 & 4) != 0 ? imageItem.bitmapKey : null, (2039 & 8) != 0 ? imageItem.uploadState : UploadState.Success, (2039 & 16) != 0 ? imageItem.remoteUrl : null, (2039 & 32) != 0 ? imageItem.netPathUrl : null, (2039 & 64) != 0 ? imageItem.width : null, (2039 & 128) != 0 ? imageItem.height : null, (2039 & 256) != 0 ? imageItem.isLoadSuccess : null, (2039 & 512) != 0 ? imageItem.filePath : null, (2039 & 1024) != 0 ? imageItem.fileSize : null);
    }

    public static final ImageItem copydefault(ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(imageItem, "");
        return imageItem.copy((2039 & 1) != 0 ? imageItem.id : null, (2039 & 2) != 0 ? imageItem.localUri : null, (2039 & 4) != 0 ? imageItem.bitmapKey : null, (2039 & 8) != 0 ? imageItem.uploadState : UploadState.Uploading, (2039 & 16) != 0 ? imageItem.remoteUrl : null, (2039 & 32) != 0 ? imageItem.netPathUrl : null, (2039 & 64) != 0 ? imageItem.width : null, (2039 & 128) != 0 ? imageItem.height : null, (2039 & 256) != 0 ? imageItem.isLoadSuccess : null, (2039 & 512) != 0 ? imageItem.filePath : null, (2039 & 1024) != 0 ? imageItem.fileSize : null);
    }

    public final void EZpvd(ImageItem imageItem, Function1<? super ImageItem, ImageItem> function1) {
        java.util.List<ImageItem> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.AEQbTJ.getValue());
        java.util.Iterator<ImageItem> it = listFJNWhG.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getId(), (java.lang.Object) imageItem.getId())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            listFJNWhG.set(i, function1.invoke(listFJNWhG.get(i)));
            copydefault(listFJNWhG);
        }
    }

    public static /* synthetic */ void activityImageUpload$default(C47546tsE c47546tsE, android.content.Context context, ActivityCardImage activityCardImage, android.graphics.Bitmap bitmap, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bitmap = null;
        }
        c47546tsE.KWHzl(context, activityCardImage, bitmap, function1);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull ActivityCardImage activityCardImage, android.graphics.Bitmap bitmap, @NotNull Function1<? super SingleFileUploadUseCase.UploadedFile, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activityCardImage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GenericInputViewModel$activityImageUpload$1(activityCardImage, function1, this, context, bitmap, null), 3, null);
    }

    public final void OLrzqt() {
        this.AEQbTJ.setValue(yDY.AhwBna());
        this.KWHzl.setValue("");
        pUU.EZpvd("GenericInputViewModel", "UI state cleared");
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setValue(str);
        pUU.EZpvd("GenericInputViewModel", "Text restored: " + str.length() + " chars");
    }

    public final void KWHzl(tWV twv, PlanetPublisherPluginType planetPublisherPluginType) {
        this.OLrzqt.setValue((twv == null || planetPublisherPluginType == null) ? null : new StateListAnimator(twv, planetPublisherPluginType));
    }

    public final void EZpvd() {
        this.OLrzqt.setValue(null);
    }

    /* JADX INFO: renamed from: o.tsE$StateListAnimator */
    public static final class StateListAnimator {
        public static final int KWHzl = tWV.copydefault;
        public final PlanetPublisherPluginType EZpvd;
        public final tWV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, tWV twv, PlanetPublisherPluginType planetPublisherPluginType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                twv = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                planetPublisherPluginType = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(twv, planetPublisherPluginType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final tWV AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PlanetPublisherPluginType KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull tWV twv, @NotNull PlanetPublisherPluginType planetPublisherPluginType) {
            Intrinsics.checkNotNullParameter(twv, "");
            Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
            return new StateListAnimator(twv, planetPublisherPluginType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PluginDataState(pluginDataModel=" + this.OLrzqt + ", pluginType=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull tWV twv, @NotNull PlanetPublisherPluginType planetPublisherPluginType) {
            Intrinsics.checkNotNullParameter(twv, "");
            Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
            this.OLrzqt = twv;
            this.EZpvd = planetPublisherPluginType;
        }
    }

    public final void AEQbTJ(@NotNull java.util.List<ImageItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        MutableStateFlow<java.util.List<ImageItem>> mutableStateFlow = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ImageItem imageItem : list) {
            UploadState uploadState = imageItem.getUploadState();
            UploadState uploadState2 = UploadState.Success;
            arrayList.add(imageItem.copy((2039 & 1) != 0 ? imageItem.id : null, (2039 & 2) != 0 ? imageItem.localUri : null, (2039 & 4) != 0 ? imageItem.bitmapKey : null, (2039 & 8) != 0 ? imageItem.uploadState : uploadState == uploadState2 ? uploadState2 : UploadState.Idle, (2039 & 16) != 0 ? imageItem.remoteUrl : null, (2039 & 32) != 0 ? imageItem.netPathUrl : null, (2039 & 64) != 0 ? imageItem.width : null, (2039 & 128) != 0 ? imageItem.height : null, (2039 & 256) != 0 ? imageItem.isLoadSuccess : null, (2039 & 512) != 0 ? imageItem.filePath : null, (2039 & 1024) != 0 ? imageItem.fileSize : null));
        }
        mutableStateFlow.setValue(arrayList);
        pUU.EZpvd("GenericInputViewModel", "Images restored: " + list.size());
    }
}
