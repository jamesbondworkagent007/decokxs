package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.oklive.app.data.LiveStreamStatus;
import com.okinc.oklive.app.data.model.remote.CefiToken;
import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.model.remote.PullUrl;
import com.okinc.oklive.app.data.model.remote.TokenToPromote;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import com.okinc.oklive.app.domain.model.PriceChangeDirection;
import com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$joinAndStartListening$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$loadData$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$loadMore$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$observeTickerUpdates$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$observeTickerUpdates$2;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$onStreamEnded$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$refreshOngoingStream$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$resumeTokenMonitoring$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$startCustomMessageListenerForChannel$1$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$startListeningForCustomMessages$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$startObservingWSConnectionStatus$1;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$startTokenPriceMonitoring$1;
import com.okinc.okuser.data.User;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC44569sUu;
import o.AbstractC44574sUz;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public final class sUN extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<AbstractC44574sUz> AEQbTJ;
    public int AYXKKw;
    public java.lang.String AhwBna;
    public LifecycleOwner AkhnZx;
    public boolean AuCTel;
    public final StateFlow<Application> AuCTelauCTel;
    public final InterfaceC44556sUh AubY;
    public java.lang.Long DbNXlk;
    public final MutableStateFlow<Application> KWHzl;
    public final MutableStateFlow<java.util.List<AbstractC44569sUu>> OLrzqt;
    public final MutableStateFlow<java.lang.Boolean> copydefault;
    public C44571sUw djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public final C44557sUi fIwbmz;
    public final C44554sUf fJNWhG;
    public final C44555sUg fetchVPNInfo;
    public final MutableStateFlow<TaskDescription> gEmmrt;
    public final StateFlow<AbstractC44574sUz> getFieldNames;
    public final StateFlow<java.util.List<AbstractC44569sUu>> getNewProxyInstance;
    public java.lang.String hDKMBd;
    public Job isConnected;
    public final StateFlow<java.lang.Boolean> iwGUEr;
    public boolean uzCIH;
    public final android.content.Context valueOf;
    public final C44552sUd values;
    public Job wlaJM;
    public final sTG zLjUOn;
    public final StateFlow<TaskDescription> zsXlph;
    public Job zuBGHE;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PriceChangeDirection.values().length];
            try {
                iArr[PriceChangeDirection.Positive.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PriceChangeDirection.Negative.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceChangeDirection.Zero.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[LiveStreamStatus.values().length];
            try {
                iArr2[LiveStreamStatus.LIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[LiveStreamStatus.PAUSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[LiveStreamStatus.ENDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[LiveStreamStatus.Cancelled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> AEQbTJ() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC44574sUz> EZpvd() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> OLrzqt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<AbstractC44569sUu>> copydefault() {
        return this.getNewProxyInstance;
    }

    public sUN(@NotNull android.content.Context context, @NotNull C44557sUi c44557sUi, @NotNull C44552sUd c44552sUd, @NotNull C44554sUf c44554sUf, @NotNull sTG stg, @NotNull InterfaceC44556sUh interfaceC44556sUh) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c44557sUi, "");
        Intrinsics.checkNotNullParameter(c44552sUd, "");
        Intrinsics.checkNotNullParameter(c44554sUf, "");
        Intrinsics.checkNotNullParameter(stg, "");
        Intrinsics.checkNotNullParameter(interfaceC44556sUh, "");
        this.valueOf = context;
        this.fIwbmz = c44557sUi;
        this.values = c44552sUd;
        this.fJNWhG = c44554sUf;
        this.zLjUOn = stg;
        this.AubY = interfaceC44556sUh;
        MutableStateFlow<java.util.List<AbstractC44569sUu>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<TaskDescription> MutableStateFlow2 = StateFlowKt.MutableStateFlow(TaskDescription.Activity.copydefault);
        this.gEmmrt = MutableStateFlow2;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.copydefault = MutableStateFlow3;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Application> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow4;
        this.AuCTelauCTel = FlowKt.asStateFlow(MutableStateFlow4);
        this.fetchVPNInfo = new C44555sUg();
        MutableStateFlow<AbstractC44574sUz> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow5;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow5);
        this.fARcdN = true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public final C44557sUi AEQbTJ;
        public final C44552sUd EZpvd;
        public final InterfaceC44556sUh KWHzl;
        public final android.content.Context OLrzqt;
        public final C44554sUf copydefault;
        public final sTG gEmmrt;

        public StateListAnimator(@NotNull android.content.Context context, @NotNull C44557sUi c44557sUi, @NotNull C44552sUd c44552sUd, @NotNull C44554sUf c44554sUf, @NotNull sTG stg, @NotNull InterfaceC44556sUh interfaceC44556sUh) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c44557sUi, "");
            Intrinsics.checkNotNullParameter(c44552sUd, "");
            Intrinsics.checkNotNullParameter(c44554sUf, "");
            Intrinsics.checkNotNullParameter(stg, "");
            Intrinsics.checkNotNullParameter(interfaceC44556sUh, "");
            this.OLrzqt = context;
            this.AEQbTJ = c44557sUi;
            this.EZpvd = c44552sUd;
            this.copydefault = c44554sUf;
            this.gEmmrt = stg;
            this.KWHzl = interfaceC44556sUh;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new sUN(this.OLrzqt, this.AEQbTJ, this.EZpvd, this.copydefault, this.gEmmrt, this.KWHzl);
        }
    }

    public final void AkhnZx() {
        this.AEQbTJ.setValue(AbstractC44574sUz.StateListAnimator.EZpvd);
    }

    public static final class Application {
        public final PriceChangeDirection EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, PriceChangeDirection priceChangeDirection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                priceChangeDirection = application.EZpvd;
            }
            return application.OLrzqt(str, priceChangeDirection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, @NotNull PriceChangeDirection priceChangeDirection) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(priceChangeDirection, "");
            return new Application(str, priceChangeDirection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && this.EZpvd == application.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenChangeUpdate(change=" + this.copydefault + ", direction=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull PriceChangeDirection priceChangeDirection) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(priceChangeDirection, "");
            this.copydefault = str;
            this.EZpvd = priceChangeDirection;
        }
    }

    public final boolean AYXKKw() {
        java.lang.Long l = this.DbNXlk;
        java.lang.String string = l != null ? l.toString() : null;
        User userOLrzqt = C44157sFk.gEmmrt().OLrzqt();
        return Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) (userOLrzqt != null ? userOLrzqt.getUid() : null));
    }

    public final boolean djBIcL() {
        return C44157sFk.gEmmrt().values();
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends TaskDescription {
            public static final Activity copydefault = new Activity();

            private Activity() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.sUN$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0943TaskDescription extends TaskDescription {
            public static final C0943TaskDescription AEQbTJ = new C0943TaskDescription();

            private C0943TaskDescription() {
                super(null);
            }
        }

        public static final class ActionBar extends TaskDescription {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        public static final class FragmentManager extends TaskDescription {
            public static final FragmentManager OLrzqt = new FragmentManager();

            private FragmentManager() {
                super(null);
            }
        }

        public static final class StateListAnimator extends TaskDescription {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        public static final class Application extends TaskDescription {
            public static final Application AEQbTJ = new Application();

            private Application() {
                super(null);
            }
        }
    }

    public static /* synthetic */ void loadData$default(sUN sun, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        sun.EZpvd(str, z, z2);
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
        if (fieldNames != null) {
            long jLongValue = fieldNames.longValue();
            if ((!this.AuCTel || z2 || z) && !this.uzCIH) {
                this.DbNXlk = java.lang.Long.valueOf(jLongValue);
                this.AYXKKw = 0;
                this.fARcdN = true;
                this.uzCIH = true;
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$loadData$1(this, jLongValue, z, null), 3, null);
            }
        }
    }

    public final void fetchVPNInfo() {
        java.lang.Long l = this.DbNXlk;
        if (l != null) {
            long jLongValue = l.longValue();
            if (this.AuCTel) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$refreshOngoingStream$1(this, jLongValue, null), 3, null);
            }
        }
    }

    public final void AhwBna() {
        java.lang.Long l;
        if (this.copydefault.getValue().booleanValue() || !this.fARcdN || (l = this.DbNXlk) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$loadMore$1(this, l.longValue(), this.AYXKKw + 1, null), 3, null);
    }

    public static /* synthetic */ java.util.List buildProfileItems$default(sUN sun, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return sun.copydefault((java.util.List<RecordingInfoResponse>) list, z, z2);
    }

    public final java.util.List<AbstractC44569sUu> copydefault(java.util.List<RecordingInfoResponse> list, boolean z, boolean z2) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (z && ((!list.isEmpty()) || z2)) {
            listOLrzqt.add(AbstractC44569sUu.Dialog.AEQbTJ);
        }
        if (list.isEmpty() && z2) {
            listOLrzqt.add(new AbstractC44569sUu.StateListAnimator(AYXKKw()));
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listOLrzqt.add(EZpvd((RecordingInfoResponse) it.next()));
            }
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final AbstractC44569sUu.ActionBar EZpvd(RecordingInfoResponse recordingInfoResponse) {
        java.lang.String vid = recordingInfoResponse.getVid();
        java.lang.String str = vid == null ? "" : vid;
        java.lang.String shareCode = recordingInfoResponse.getShareCode();
        java.lang.String str2 = shareCode == null ? "" : shareCode;
        java.lang.String title = recordingInfoResponse.getTitle();
        java.lang.String str3 = title == null ? "" : title;
        java.lang.String cdnThumbnailPath = recordingInfoResponse.getCdnThumbnailPath();
        C44544sTw c44544sTw = C44544sTw.OLrzqt;
        return new AbstractC44569sUu.ActionBar(str, str2, str3, cdnThumbnailPath, c44544sTw.OLrzqt(recordingInfoResponse.getStartTime()), c44544sTw.copydefault(C33129mqd.valueOf(recordingInfoResponse.getTotalViewCount()), false));
    }

    public final void AEQbTJ(@NotNull AbstractC44569sUu.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        MutableStateFlow<java.util.List<AbstractC44569sUu>> mutableStateFlow = this.OLrzqt;
        java.util.List<AbstractC44569sUu> value = mutableStateFlow.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            AbstractC44569sUu abstractC44569sUu = (AbstractC44569sUu) obj;
            if (!(abstractC44569sUu instanceof AbstractC44569sUu.Activity) || !Intrinsics.EZpvd((java.lang.Object) ((AbstractC44569sUu.Activity) abstractC44569sUu).copydefault(), (java.lang.Object) activity.copydefault())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(arrayList);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super sTB> continuation) {
        return this.values.AEQbTJ(str, continuation);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$onStreamEnded$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC44569sUu.Activity copydefault(LivestreamInfoResponse livestreamInfoResponse) {
        C44571sUw c44571sUw;
        PullUrl pullUrl;
        java.lang.String str;
        java.lang.String channelId = livestreamInfoResponse.getChannelId();
        java.lang.String strResolveShareCode = livestreamInfoResponse.resolveShareCode();
        java.lang.String str2 = strResolveShareCode == null ? "" : strResolveShareCode;
        java.lang.String title = livestreamInfoResponse.getTitle();
        java.lang.String cdnThumbnailPath = livestreamInfoResponse.getCdnThumbnailPath();
        java.lang.Long currentViews = livestreamInfoResponse.getCurrentViews();
        long jLongValue = currentViews != null ? currentViews.longValue() : 0L;
        TokenToPromote tokenToPromote = livestreamInfoResponse.getTokenToPromote();
        java.lang.String url = null;
        if (tokenToPromote != null) {
            java.lang.String tokenSymbol = tokenToPromote.getTokenSymbol();
            java.lang.String str3 = tokenSymbol == null ? "" : tokenSymbol;
            java.lang.String change1h = tokenToPromote.getChange1h();
            if (change1h != null) {
                if (!C59449zhJ.startsWith$default(change1h, "-", false, 2, null)) {
                    change1h = Marker.ANY_NON_NULL_MARKER + change1h;
                }
                if (change1h != null) {
                    java.lang.String str4 = change1h + "%";
                    if (str4 != null) {
                        str = str4;
                    }
                    java.lang.String tokenLogo = tokenToPromote.getTokenLogo();
                    CefiToken cefiToken = tokenToPromote.getCefiToken();
                    c44571sUw = new C44571sUw(str3, str, tokenLogo, cefiToken == null ? cefiToken.getInstId() : null, tokenToPromote.getTokenType(), tokenToPromote.getTokenLogo(), tokenToPromote.getChainLogo(), java.lang.Boolean.valueOf(tokenToPromote.getCefiToken() != null));
                }
            } else {
                str = "";
                java.lang.String tokenLogo2 = tokenToPromote.getTokenLogo();
                CefiToken cefiToken2 = tokenToPromote.getCefiToken();
                c44571sUw = new C44571sUw(str3, str, tokenLogo2, cefiToken2 == null ? cefiToken2.getInstId() : null, tokenToPromote.getTokenType(), tokenToPromote.getTokenLogo(), tokenToPromote.getChainLogo(), java.lang.Boolean.valueOf(tokenToPromote.getCefiToken() != null));
            }
        } else {
            c44571sUw = null;
        }
        java.util.List<PullUrl> pullUrlList = livestreamInfoResponse.getPullUrlList();
        if (pullUrlList != null && (pullUrl = (PullUrl) CollectionsKt___CollectionsKt.firstOrNull(pullUrlList)) != null) {
            url = pullUrl.getUrl();
        }
        return new AbstractC44569sUu.Activity(channelId, str2, title, cdnThumbnailPath, jLongValue, c44571sUw, url);
    }

    public final void copydefault(C44571sUw c44571sUw) {
        Job job;
        java.lang.String strOLrzqt = c44571sUw != null ? c44571sUw.OLrzqt() : null;
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            return;
        }
        C44571sUw c44571sUw2 = this.djBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) (c44571sUw2 != null ? c44571sUw2.OLrzqt() : null), (java.lang.Object) strOLrzqt) && (job = this.wlaJM) != null && job.isActive()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$startTokenPriceMonitoring$1(this, c44571sUw, strOLrzqt, null), 3, null);
    }

    public final Job valueOf() {
        return FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(this.zLjUOn.OLrzqt(), new LivestreamListViewModel$observeTickerUpdates$1(this, null)), new LivestreamListViewModel$observeTickerUpdates$2(null)), ViewModelKt.getViewModelScope(this));
    }

    public final java.lang.String copydefault(java.lang.String str, PriceChangeDirection priceChangeDirection) {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(C59449zhJ.replace$default(str, Marker.ANY_NON_NULL_MARKER, "", false, 4, (java.lang.Object) null), "-", "", false, 4, (java.lang.Object) null)).toString();
        int i = Activity.AEQbTJ[priceChangeDirection.ordinal()];
        if (i == 1) {
            return Marker.ANY_NON_NULL_MARKER + string;
        }
        if (i != 2) {
            if (i == 3) {
                return string;
            }
            throw new NoWhenBranchMatchedException();
        }
        return "-" + string;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        fIwbmz();
        ejfBZ();
    }

    public final void values() {
        Job job = this.wlaJM;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.wlaJM = null;
    }

    public final void isConnected() {
        java.lang.String strOLrzqt;
        C44571sUw c44571sUw = this.djBIcL;
        if (c44571sUw == null || (strOLrzqt = c44571sUw.OLrzqt()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$resumeTokenMonitoring$1(this, strOLrzqt, new Ref.BooleanRef(), null), 3, null);
    }

    public final void fIwbmz() {
        Job job = this.wlaJM;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.wlaJM = null;
        this.zLjUOn.AEQbTJ();
        this.djBIcL = null;
    }

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.AkhnZx = lifecycleOwner;
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.zuBGHE;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        DbNXlk();
        this.isConnected = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$startListeningForCustomMessages$1(this, lifecycleOwner, null), 3, null);
    }

    public final void KWHzl() {
        this.fetchVPNInfo.OLrzqt();
        if (this.ejfBZ) {
            java.lang.String str = this.AhwBna;
            if (str != null) {
                EZpvd(str);
            }
            this.ejfBZ = false;
        }
    }

    public final void copydefault(java.lang.String str, LifecycleOwner lifecycleOwner) {
        this.fetchVPNInfo.OLrzqt(str, lifecycleOwner, new Function1() { // from class: o.sUS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sUN.KWHzl(this.EZpvd, (OKMessage) obj);
            }
        });
    }

    public static final Unit KWHzl(sUN sun, OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(sun), null, null, new LivestreamListViewModel$startCustomMessageListenerForChannel$1$1(sun, oKMessage, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        this.zuBGHE = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$startObservingWSConnectionStatus$1(this, null), 3, null);
    }

    public final void EZpvd(java.lang.String str, LifecycleOwner lifecycleOwner) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            return;
        }
        if (C44157sFk.gEmmrt().values()) {
            KWHzl(str, lifecycleOwner);
            return;
        }
        C44539sTr c44539sTr = C44539sTr.EZpvd;
        java.lang.String strAEQbTJ = c44539sTr.AEQbTJ();
        java.lang.String strCopydefault = c44539sTr.copydefault();
        if (strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ) || strCopydefault == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            return;
        }
        interfaceC35180nqU.EZpvd(strAEQbTJ, strCopydefault);
    }

    public final void KWHzl(java.lang.String str, LifecycleOwner lifecycleOwner) {
        if (this.ejfBZ && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) str)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamListViewModel$joinAndStartListening$1(str, this, lifecycleOwner, null), 3, null);
    }

    public final void ejfBZ() {
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.isConnected = null;
        Job job2 = this.zuBGHE;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.zuBGHE = null;
        KWHzl();
        this.AhwBna = null;
        this.hDKMBd = null;
        this.AkhnZx = null;
    }

    public final void EZpvd(java.lang.String str) {
        sGF sgfKWHzl;
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null || (sgfKWHzl = interfaceC35180nqU.KWHzl()) == null) {
            return;
        }
        sgfKWHzl.EZpvd(str, new PendingIntent(str));
    }

    public static final class PendingIntent implements sGC {
        public final /* synthetic */ java.lang.String copydefault;

        public PendingIntent(java.lang.String str) {
            this.copydefault = str;
        }

        @Override // o.sGC
        public void AEQbTJ() {
            pUU.EZpvd("LivestreamListViewModel", "Left channel: " + this.copydefault);
        }

        @Override // o.sGC
        public void copydefault() {
            pUU.copydefault("LivestreamListViewModel", "Failed to leave channel: " + this.copydefault);
        }
    }

    public final void OLrzqt(LiveStreamCustomMessageUpdate liveStreamCustomMessageUpdate) {
        if (liveStreamCustomMessageUpdate instanceof LiveStreamCustomMessageUpdate.Application) {
            int i = Activity.copydefault[((LiveStreamCustomMessageUpdate.Application) liveStreamCustomMessageUpdate).copydefault().ordinal()];
            if (i == 1) {
                this.AEQbTJ.setValue(AbstractC44574sUz.Dialog.OLrzqt);
                return;
            }
            if (i == 2) {
                this.AEQbTJ.setValue(AbstractC44574sUz.StateListAnimator.EZpvd);
            } else if (i == 3 || i == 4) {
                gEmmrt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fJNWhG() {
        android.net.Network activeNetwork;
        android.net.NetworkCapabilities networkCapabilities;
        java.lang.Object systemService = this.valueOf.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.util.List<? extends AbstractC44569sUu> list, boolean z) {
        Job job;
        C44571sUw c44571sUwAhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AbstractC44569sUu.Activity) {
                arrayList.add(obj);
            }
        }
        AbstractC44569sUu.Activity activity = (AbstractC44569sUu.Activity) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        java.lang.String strOLrzqt = (activity == null || (c44571sUwAhwBna = activity.AhwBna()) == null) ? null : c44571sUwAhwBna.OLrzqt();
        if (!z) {
            C44571sUw c44571sUw = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) (c44571sUw != null ? c44571sUw.OLrzqt() : null)) || (job = this.wlaJM) == null || !job.isActive()) {
            }
        } else if (strOLrzqt != null) {
            copydefault(activity.AhwBna());
            return;
        }
        if (strOLrzqt != null || this.djBIcL == null) {
            return;
        }
        fIwbmz();
    }
}
