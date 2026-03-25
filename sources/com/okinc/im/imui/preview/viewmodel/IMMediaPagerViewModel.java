package com.okinc.im.imui.preview.viewmodel;

import android.graphics.PointF;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.im.imui.preview.model.ImageState;
import com.okinc.im.imui.preview.model.PagerState;
import com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel;
import com.okinc.im.imui.tracking.model.MediaType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.AbstractC33073mpa;
import o.C35779oDj;
import o.C35804oEh;
import o.C37186opA;
import o.C37233opv;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.oCE;
import o.oDB;
import o.oDT;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IMMediaPagerViewModel extends AbstractC33073mpa {
    public final oCE AYXKKw;
    public final SharedFlow<ActionBar> AhwBna;
    public final oDT DbNXlk;
    public final MutableStateFlow<List<C37233opv>> EZpvd;
    public final StateFlow<PagerState> KWHzl;
    public final StateFlow<Map<Long, ImageState>> OLrzqt;
    public final MutableSharedFlow<ActionBar> copydefault;
    public final C35804oEh djBIcL;
    public final Mutex fetchVPNInfo;
    public final C35779oDj gEmmrt;
    public final SavedStateHandle isConnected;
    public final oDB valueOf;
    public final StateFlow<List<C37186opA>> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[OKConversationType.values().length];
            try {
                iArr2[OKConversationType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C37186opA>> djBIcL() {
        return this.values;
    }

    @yCM
    public IMMediaPagerViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C35804oEh c35804oEh, @NotNull oCE oce, @NotNull oDB odb, @NotNull oDT odt, @NotNull C35779oDj c35779oDj) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c35804oEh, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(odb, "");
        Intrinsics.checkNotNullParameter(odt, "");
        Intrinsics.checkNotNullParameter(c35779oDj, "");
        this.isConnected = savedStateHandle;
        this.djBIcL = c35804oEh;
        this.AYXKKw = oce;
        this.valueOf = odb;
        this.DbNXlk = odt;
        this.gEmmrt = c35779oDj;
        StateFlow<PagerState> stateFlow = savedStateHandle.getStateFlow("KEY_PAGER_STATE", PagerState.TRANSITION_PROXY);
        this.KWHzl = stateFlow;
        StateFlow<Map<Long, ImageState>> stateFlow2 = savedStateHandle.getStateFlow("KEY_IMAGE_STATE", C56424yEw.KWHzl());
        this.OLrzqt = stateFlow2;
        MutableStateFlow<List<C37233opv>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow;
        this.values = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, stateFlow, stateFlow2, new IMMediaPagerViewModel$pageList$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), yDY.AhwBna());
        MutableSharedFlow<ActionBar> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.fetchVPNInfo = MutexKt.Mutex$default(false, 1, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends ActionBar {
            public final MediaType copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, MediaType mediaType, int i, Object obj) {
                if ((i & 1) != 0) {
                    mediaType = activity.copydefault;
                }
                return activity.AEQbTJ(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(MediaType mediaType) {
                return new Activity(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.copydefault == ((Activity) obj).copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                MediaType mediaType = this.copydefault;
                if (mediaType == null) {
                    return 0;
                }
                return mediaType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(mediaType=" + this.copydefault + ")";
            }

            public Activity(MediaType mediaType) {
                super(null);
                this.copydefault = mediaType;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends ActionBar {
            public final MediaType AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, MediaType mediaType, int i, Object obj) {
                if ((i & 1) != 0) {
                    mediaType = taskDescription.AEQbTJ;
                }
                return taskDescription.copydefault(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public MediaType OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(MediaType mediaType) {
                return new TaskDescription(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.AEQbTJ == ((TaskDescription) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                MediaType mediaType = this.AEQbTJ;
                if (mediaType == null) {
                    return 0;
                }
                return mediaType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(mediaType=" + this.AEQbTJ + ")";
            }

            public TaskDescription(MediaType mediaType) {
                super(null);
                this.AEQbTJ = mediaType;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends ActionBar {
            public final MediaType copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, MediaType mediaType, int i, Object obj) {
                if ((i & 1) != 0) {
                    mediaType = stateListAnimator.copydefault;
                }
                return stateListAnimator.copydefault(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(MediaType mediaType) {
                return new StateListAnimator(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public MediaType copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && this.copydefault == ((StateListAnimator) obj).copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                MediaType mediaType = this.copydefault;
                if (mediaType == null) {
                    return 0;
                }
                return mediaType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FailedDownload(mediaType=" + this.copydefault + ")";
            }

            public StateListAnimator(MediaType mediaType) {
                super(null);
                this.copydefault = mediaType;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends ActionBar {
            public final MediaType EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, MediaType mediaType, int i, Object obj) {
                if ((i & 1) != 0) {
                    mediaType = application.EZpvd;
                }
                return application.AEQbTJ(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(MediaType mediaType) {
                return new Application(mediaType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public MediaType AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && this.EZpvd == ((Application) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                MediaType mediaType = this.EZpvd;
                if (mediaType == null) {
                    return 0;
                }
                return mediaType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FailedSave(mediaType=" + this.EZpvd + ")";
            }

            public Application(MediaType mediaType) {
                super(null);
                this.EZpvd = mediaType;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AhwBna() {
        Integer num = (Integer) this.isConnected.get("KEY_CURRENT_INDEX");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final boolean gEmmrt() {
        Boolean bool = (Boolean) this.isConnected.get("KEY_IS_LOADING_BEFORE");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean valueOf() {
        Boolean bool = (Boolean) this.isConnected.get("KEY_IS_LOADING_AFTER");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean EZpvd() {
        Boolean bool = (Boolean) this.isConnected.get("KEY_HAS_MORE_BEFORE");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean copydefault() {
        Boolean bool = (Boolean) this.isConnected.get("KEY_HAS_MORE_AFTER");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void copydefault(int i) {
        this.isConnected.set("KEY_CURRENT_INDEX", Integer.valueOf(i));
    }

    public final void AYXKKw() {
        this.isConnected.set("KEY_PAGER_STATE", PagerState.MAIN_CONTENT);
        pUU.KWHzl("IMMediaPagerViewModel", "notifyEnterTransitionEnd: Switching to main content state");
    }

    public final void EZpvd(int i) {
        this.isConnected.set("KEY_CURRENT_INDEX", Integer.valueOf(i));
        this.isConnected.set("KEY_PAGER_STATE", PagerState.PREPARE_FOR_FINISH);
        pUU.KWHzl("IMMediaPagerViewModel", "notifyPrepareExitTransition: Preparing finish transition. Current position: " + i);
    }

    public final void EZpvd(long j, Function1<? super ImageState, ImageState> function1) {
        Map mapKWHzl = (Map) this.isConnected.get("KEY_IMAGE_STATE");
        if (mapKWHzl == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        HashMap map = new HashMap(mapKWHzl);
        Object orDefault = map.getOrDefault(Long.valueOf(j), new ImageState(false, 0.0f, null, 7, null));
        Intrinsics.checkNotNullExpressionValue(orDefault, "");
        ImageState imageStateInvoke = function1.invoke((ImageState) orDefault);
        map.put(Long.valueOf(j), imageStateInvoke);
        this.isConnected.set("KEY_IMAGE_STATE", map);
        pUU.EZpvd("IMMediaPagerViewModel", "updateImageState: messageId: " + j + ", newState: " + imageStateInvoke);
    }

    public final void OLrzqt(long j, final boolean z) {
        EZpvd(j, new Function1() { // from class: o.opz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return IMMediaPagerViewModel.copydefault(z, (ImageState) obj);
            }
        });
    }

    public static final ImageState copydefault(boolean z, ImageState imageState) {
        Intrinsics.checkNotNullParameter(imageState, "");
        return ImageState.copy$default(imageState, z, 0.0f, null, 6, null);
    }

    public final void copydefault(long j, final float f, @NotNull final PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        EZpvd(j, new Function1() { // from class: o.opx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return IMMediaPagerViewModel.EZpvd(f, pointF, (ImageState) obj);
            }
        });
    }

    public static final ImageState EZpvd(float f, PointF pointF, ImageState imageState) {
        Intrinsics.checkNotNullParameter(imageState, "");
        return ImageState.copy$default(imageState, false, f, pointF, 1, null);
    }

    public final void KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (!this.EZpvd.getValue().isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new IMMediaPagerViewModel$loadInitialMedia$1(this, oKMessage, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new IMMediaPagerViewModel$fetchMoreBefore$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new IMMediaPagerViewModel$fetchMoreAfter$1(this, null), 3, null);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final Integer AhwBna;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, Integer num, Integer num2, int i, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i2 & 2) != 0) {
                num = taskDescription.copydefault;
            }
            Integer num3 = num;
            if ((i2 & 4) != 0) {
                num2 = taskDescription.AhwBna;
            }
            Integer num4 = num2;
            if ((i2 & 8) != 0) {
                i = taskDescription.AEQbTJ;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str2 = taskDescription.KWHzl;
            }
            String str4 = str2;
            if ((i2 & 32) != 0) {
                str3 = taskDescription.OLrzqt;
            }
            return taskDescription.copydefault(str, num3, num4, i3, str4, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(String str, Integer num, Integer num2, int i, String str2, String str3) {
            return new TaskDescription(str, num, num2, i, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.AhwBna, taskDescription.AhwBna) && this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd((Object) this.KWHzl, (Object) taskDescription.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            Integer num = this.copydefault;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.AhwBna;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            int iHashCode4 = Integer.hashCode(this.AEQbTJ);
            String str2 = this.KWHzl;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.OLrzqt;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MediaPagerTrackingData(fileType=" + this.EZpvd + ", groupType=" + this.copydefault + ", senderGroupRole=" + this.AhwBna + ", channelType=" + this.AEQbTJ + ", conversationTitle=" + this.KWHzl + ", channelId=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer valueOf() {
            return this.AhwBna;
        }

        public TaskDescription(String str, Integer num, Integer num2, int i, String str2, String str3) {
            this.EZpvd = str;
            this.copydefault = num;
            this.AhwBna = num2;
            this.AEQbTJ = i;
            this.KWHzl = str2;
            this.OLrzqt = str3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MediaType AEQbTJ(OKMessageContent oKMessageContent) {
        Parcelable image;
        if (oKMessageContent instanceof OKReferenceMessage) {
            Parcelable originalOKMessageContent = ((OKReferenceMessage) oKMessageContent).getOriginalOKMessageContent();
            image = originalOKMessageContent instanceof OKMediaMessageContent ? (OKMediaMessageContent) originalOKMessageContent : null;
        } else if ((oKMessageContent instanceof OKImageMessage) || (oKMessageContent instanceof OKSightMessage) || (oKMessageContent instanceof OKGIFMessage)) {
            image = (OKMediaMessageContent) oKMessageContent;
        } else if (oKMessageContent instanceof OKShareMessage) {
            image = ((OKShareMessage) oKMessageContent).getImage();
        }
        if ((image instanceof OKImageMessage) || (image instanceof OKShareMessage)) {
            return MediaType.IMAGE;
        }
        if (image instanceof OKGIFMessage) {
            return MediaType.GIF;
        }
        if (image instanceof OKSightMessage) {
            return MediaType.VIDEO;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull OKMessage oKMessage, @NotNull Continuation<? super TaskDescription> continuation) throws Throwable {
        IMMediaPagerViewModel$getTrackingInfo$1 iMMediaPagerViewModel$getTrackingInfo$1;
        String targetId;
        Object objOLrzqt;
        IMMediaPagerViewModel iMMediaPagerViewModel;
        String str;
        String str2;
        String str3;
        Triple triple;
        OKMessage oKMessage2;
        String str4;
        String str5;
        String str6;
        Object objInvoke$default;
        String str7;
        Integer num;
        String str8;
        String str9;
        if (continuation instanceof IMMediaPagerViewModel$getTrackingInfo$1) {
            iMMediaPagerViewModel$getTrackingInfo$1 = (IMMediaPagerViewModel$getTrackingInfo$1) continuation;
            int i = iMMediaPagerViewModel$getTrackingInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iMMediaPagerViewModel$getTrackingInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                iMMediaPagerViewModel$getTrackingInfo$1 = new IMMediaPagerViewModel$getTrackingInfo$1(this, continuation);
            }
        }
        IMMediaPagerViewModel$getTrackingInfo$1 iMMediaPagerViewModel$getTrackingInfo$12 = iMMediaPagerViewModel$getTrackingInfo$1;
        Object obj = iMMediaPagerViewModel$getTrackingInfo$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = iMMediaPagerViewModel$getTrackingInfo$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            targetId = oKMessage.getTargetId();
            oCE oce = this.AYXKKw;
            iMMediaPagerViewModel$getTrackingInfo$12.L$0 = this;
            iMMediaPagerViewModel$getTrackingInfo$12.L$1 = oKMessage;
            iMMediaPagerViewModel$getTrackingInfo$12.L$2 = targetId;
            iMMediaPagerViewModel$getTrackingInfo$12.label = 1;
            objOLrzqt = oce.OLrzqt(targetId, iMMediaPagerViewModel$getTrackingInfo$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            iMMediaPagerViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    num = (Integer) iMMediaPagerViewModel$getTrackingInfo$12.L$3;
                    str7 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$2;
                    str8 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$1;
                    str9 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$0;
                    C56391yDq.AEQbTJ(obj);
                    GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj;
                    GroupRole role = groupMemberInfo == null ? groupMemberInfo.getRole() : null;
                    triple = new Triple(C56443yFo.AEQbTJ(0), num, role != null ? C56443yFo.AEQbTJ(role.getCode()) : null);
                    str2 = str8;
                    str = str9;
                    str3 = str7;
                    return new TaskDescription(str3, (Integer) triple.component2(), (Integer) triple.component3(), ((Number) triple.component1()).intValue(), str2, str);
                }
                str6 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$4;
                String str10 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$3;
                String str11 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$2;
                oKMessage2 = (OKMessage) iMMediaPagerViewModel$getTrackingInfo$12.L$1;
                iMMediaPagerViewModel = (IMMediaPagerViewModel) iMMediaPagerViewModel$getTrackingInfo$12.L$0;
                C56391yDq.AEQbTJ(obj);
                str5 = str10;
                str4 = str11;
                GroupInfo groupInfo = (GroupInfo) obj;
                Integer type = groupInfo == null ? groupInfo.getType() : null;
                oDT odt = iMMediaPagerViewModel.DbNXlk;
                String senderUserId = oKMessage2.getSenderUserId();
                iMMediaPagerViewModel$getTrackingInfo$12.L$0 = str4;
                iMMediaPagerViewModel$getTrackingInfo$12.L$1 = str5;
                iMMediaPagerViewModel$getTrackingInfo$12.L$2 = str6;
                iMMediaPagerViewModel$getTrackingInfo$12.L$3 = type;
                iMMediaPagerViewModel$getTrackingInfo$12.L$4 = null;
                iMMediaPagerViewModel$getTrackingInfo$12.label = 3;
                objInvoke$default = oDT.invoke$default(odt, str4, senderUserId, false, iMMediaPagerViewModel$getTrackingInfo$12, 4, null);
                if (objInvoke$default != objCopydefault) {
                    return objCopydefault;
                }
                str7 = str6;
                num = type;
                obj = objInvoke$default;
                str8 = str5;
                str9 = str4;
                GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) obj;
                if (groupMemberInfo2 == null) {
                }
                triple = new Triple(C56443yFo.AEQbTJ(0), num, role != null ? C56443yFo.AEQbTJ(role.getCode()) : null);
                str2 = str8;
                str = str9;
                str3 = str7;
                return new TaskDescription(str3, (Integer) triple.component2(), (Integer) triple.component3(), ((Number) triple.component1()).intValue(), str2, str);
            }
            String str12 = (String) iMMediaPagerViewModel$getTrackingInfo$12.L$2;
            OKMessage oKMessage3 = (OKMessage) iMMediaPagerViewModel$getTrackingInfo$12.L$1;
            iMMediaPagerViewModel = (IMMediaPagerViewModel) iMMediaPagerViewModel$getTrackingInfo$12.L$0;
            C56391yDq.AEQbTJ(obj);
            targetId = str12;
            oKMessage = oKMessage3;
            objOLrzqt = obj;
        }
        OKConversation oKConversation = (OKConversation) objOLrzqt;
        String conversationTitle = oKConversation != null ? oKConversation.getConversationTitle() : null;
        MediaType mediaTypeAEQbTJ = iMMediaPagerViewModel.AEQbTJ(oKMessage.getContent());
        int i3 = mediaTypeAEQbTJ == null ? -1 : StateListAnimator.copydefault[mediaTypeAEQbTJ.ordinal()];
        String str13 = (i3 == 1 || i3 == 2) ? TtmlNode.TAG_IMAGE : i3 != 3 ? null : MimeTypes.BASE_TYPE_VIDEO;
        if (StateListAnimator.OLrzqt[oKMessage.getConversationType().ordinal()] == 1) {
            oDB odb = iMMediaPagerViewModel.valueOf;
            iMMediaPagerViewModel$getTrackingInfo$12.L$0 = iMMediaPagerViewModel;
            iMMediaPagerViewModel$getTrackingInfo$12.L$1 = oKMessage;
            iMMediaPagerViewModel$getTrackingInfo$12.L$2 = targetId;
            iMMediaPagerViewModel$getTrackingInfo$12.L$3 = conversationTitle;
            iMMediaPagerViewModel$getTrackingInfo$12.L$4 = str13;
            iMMediaPagerViewModel$getTrackingInfo$12.label = 2;
            Object objAEQbTJ = odb.AEQbTJ(targetId, iMMediaPagerViewModel$getTrackingInfo$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            oKMessage2 = oKMessage;
            str4 = targetId;
            str5 = conversationTitle;
            obj = objAEQbTJ;
            str6 = str13;
            GroupInfo groupInfo2 = (GroupInfo) obj;
            if (groupInfo2 == null) {
            }
            oDT odt2 = iMMediaPagerViewModel.DbNXlk;
            String senderUserId2 = oKMessage2.getSenderUserId();
            iMMediaPagerViewModel$getTrackingInfo$12.L$0 = str4;
            iMMediaPagerViewModel$getTrackingInfo$12.L$1 = str5;
            iMMediaPagerViewModel$getTrackingInfo$12.L$2 = str6;
            iMMediaPagerViewModel$getTrackingInfo$12.L$3 = type;
            iMMediaPagerViewModel$getTrackingInfo$12.L$4 = null;
            iMMediaPagerViewModel$getTrackingInfo$12.label = 3;
            objInvoke$default = oDT.invoke$default(odt2, str4, senderUserId2, false, iMMediaPagerViewModel$getTrackingInfo$12, 4, null);
            if (objInvoke$default != objCopydefault) {
            }
        } else {
            str = targetId;
            str2 = conversationTitle;
            str3 = str13;
            triple = new Triple(C56443yFo.AEQbTJ(1), null, null);
            return new TaskDescription(str3, (Integer) triple.component2(), (Integer) triple.component3(), ((Number) triple.component1()).intValue(), str2, str);
        }
    }

    public final void KWHzl(@NotNull OKMessage oKMessage, @NotNull String str) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new IMMediaPagerViewModel$downloadMedia$1(oKMessage, this, str, null), 3, null);
    }
}
