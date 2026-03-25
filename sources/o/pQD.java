package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.core.Action;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt;
import com.amplifyframework.ui.liveness.ui.LivenessColorScheme;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.fragment.EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2;
import com.okinc.liveness.eop.fragment.EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1;
import com.okinc.liveness.eop.fragment.EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$3$1$3;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45508srO;
import o.pQD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pQD extends AbstractC32996moC {
    public boolean AEQbTJ;
    public boolean EZpvd;
    public EopLivenessBasicViewModel KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String strIsConnected;
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.KWHzl = (EopLivenessBasicViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(EopLivenessBasicViewModel.class);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWSCaptureSelfie_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pQD.copydefault(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        if (eopLivenessBasicViewModel != null && (strIsConnected = eopLivenessBasicViewModel.isConnected()) != null) {
            str = strIsConnected;
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        java.lang.Boolean boolValueOf = eopLivenessBasicViewModel2 != null ? java.lang.Boolean.valueOf(eopLivenessBasicViewModel2.zsXlph()) : null;
        pUU.KWHzl("kyc_in_house", "AWSCaptureSelfie_Full_Page_View onCreate " + str + " needProxy=" + boolValueOf + " bootTime=" + OLrzqt());
    }

    public static final Unit copydefault(pQD pqd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "onCreate", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqd.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", pqd.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, pqd.AEQbTJ(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = pqd.KWHzl;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt() {
        try {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            long j = 60;
            return ((int) (jUptimeMillis / ((long) 3600000))) + "h " + ((int) ((jUptimeMillis / ((long) 60000)) % j)) + "m " + ((int) ((jUptimeMillis / ((long) 1000)) % j)) + com.ibm.icu.text.DateFormat.SECOND;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String EZpvd() {
        java.lang.String strIsConnected;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strIsConnected = eopLivenessBasicViewModel.isConnected()) == null) ? "" : strIsConnected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String KWHzl() {
        java.lang.String strOcIXYQ;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strOcIXYQ = eopLivenessBasicViewModel.OcIXYQ()) == null) ? "" : strOcIXYQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AEQbTJ() {
        java.lang.String strORxRYg;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strORxRYg = eopLivenessBasicViewModel.ORxRYg()) == null) ? "" : strORxRYg;
    }

    public final void OLrzqt(java.lang.String str) {
        EventData eventData = new EventData();
        eventData.setAct("event_aws_proxy_wss_doh_error");
        eventData.setMsg(str);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        EopLivenessBasicViewModel eopLivenessBasicViewModel = (EopLivenessBasicViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(EopLivenessBasicViewModel.class);
        java.lang.String strGEmmrt = eopLivenessBasicViewModel.gEmmrt();
        C38260pSe c38260pSe = eopLivenessBasicViewModel.zsXlph() ? new C38260pSe(strGEmmrt, eopLivenessBasicViewModel.AuCTel()) : null;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1159006916, true, new ActionBar(eopLivenessBasicViewModel, c38260pSe, this, strGEmmrt)));
        return composeView;
    }

    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ EopLivenessBasicViewModel EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ pQD OLrzqt;
        public final /* synthetic */ C38260pSe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(EopLivenessBasicViewModel eopLivenessBasicViewModel, C38260pSe c38260pSe, pQD pqd, java.lang.String str) {
            this.EZpvd = eopLivenessBasicViewModel;
            this.copydefault = c38260pSe;
            this.OLrzqt = pqd;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1159006916, i, -1, "com.okinc.liveness.eop.fragment.EopAwsFaceLivenessFragment.onCreateView.<anonymous>.<anonymous> (EopAwsFaceLivenessFragment.kt:104)");
                }
                MaterialThemeKt.MaterialTheme(LivenessColorScheme.INSTANCE.m6084default(composer, LivenessColorScheme.$stable), null, null, ComposableLambdaKt.composableLambda(composer, -1864302616, true, new AnonymousClass2(this.EZpvd, this.copydefault, this.OLrzqt, this.KWHzl)), composer, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: renamed from: o.pQD$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2 implements Function2<Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ C38260pSe AEQbTJ;
            public final /* synthetic */ pQD EZpvd;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ EopLivenessBasicViewModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(EopLivenessBasicViewModel eopLivenessBasicViewModel, C38260pSe c38260pSe, pQD pqd, java.lang.String str) {
                this.copydefault = eopLivenessBasicViewModel;
                this.AEQbTJ = c38260pSe;
                this.EZpvd = pqd;
                this.OLrzqt = str;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
                AEQbTJ(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(Composer composer, int i) {
                java.util.Map<java.lang.String, java.lang.String> customHeader;
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864302616, i, -1, "com.okinc.liveness.eop.fragment.EopAwsFaceLivenessFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (EopAwsFaceLivenessFragment.kt:108)");
                    }
                    java.lang.String strUzCIH = this.copydefault.uzCIH();
                    final java.lang.String strValueOf = this.copydefault.valueOf();
                    C38260pSe c38260pSe = this.AEQbTJ;
                    composer.startReplaceableGroup(230698092);
                    boolean zChangedInstance = composer.changedInstance(this.EZpvd);
                    boolean zChangedInstance2 = composer.changedInstance(this.copydefault);
                    final pQD pqd = this.EZpvd;
                    final EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    if ((zChangedInstance | zChangedInstance2) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Action() { // from class: o.pQI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.amplifyframework.core.Action
                            public final void call() {
                                pQD.ActionBar.AnonymousClass2.KWHzl(pqd, eopLivenessBasicViewModel);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Action action = (Action) objRememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(230743649);
                    boolean zChanged = composer.changed(strValueOf);
                    boolean zChanged2 = composer.changed(this.OLrzqt);
                    boolean zChangedInstance3 = composer.changedInstance(this.EZpvd);
                    boolean zChangedInstance4 = composer.changedInstance(this.copydefault);
                    final java.lang.String str = this.OLrzqt;
                    final pQD pqd2 = this.EZpvd;
                    final EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.copydefault;
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if ((zChanged | zChanged2 | zChangedInstance3 | zChangedInstance4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.amplifyframework.core.Consumer() { // from class: o.pQP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(java.lang.Object obj) {
                                pQD.ActionBar.AnonymousClass2.OLrzqt(strValueOf, str, pqd2, eopLivenessBasicViewModel2, (FaceLivenessDetectionException) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    com.amplifyframework.core.Consumer consumer = (com.amplifyframework.core.Consumer) objRememberedValue2;
                    composer.endReplaceableGroup();
                    boolean zZsXlph = this.copydefault.zsXlph();
                    java.lang.String strQUSxYX = this.copydefault.QUSxYX();
                    FacialExtParams facialExtParamsFJNWhG = this.copydefault.fJNWhG();
                    FaceLivenessDetectorKt.FaceLivenessDetector(strUzCIH, strValueOf, c38260pSe, true, action, consumer, zZsXlph, strQUSxYX, (facialExtParamsFJNWhG == null || (customHeader = facialExtParamsFJNWhG.getCustomHeader()) == null) ? null : customHeader.get("Subdomain-Strategy"), composer, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            public static final void KWHzl(final pQD pqd, final EopLivenessBasicViewModel eopLivenessBasicViewModel) {
                pUU.KWHzl("kyc_in_house", "Face Liveness flow is complete");
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("AWSCaptureSelfie_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pQD.ActionBar.AnonymousClass2.KWHzl(pqd, eopLivenessBasicViewModel, (EventParamsList) obj);
                    }
                });
                pqd.EZpvd = true;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(pqd), null, null, new EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2(eopLivenessBasicViewModel, null), 3, null);
            }

            public static final Unit KWHzl(pQD pqd, EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqd.EZpvd(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "flow_source", pqd.KWHzl(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, pqd.AEQbTJ(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, eopLivenessBasicViewModel.zsXlph() ? "true" : "false", false, 4, null);
                return Unit.INSTANCE;
            }

            public static final void OLrzqt(final java.lang.String str, final java.lang.String str2, final pQD pqd, final EopLivenessBasicViewModel eopLivenessBasicViewModel, final FaceLivenessDetectionException faceLivenessDetectionException) {
                java.lang.Throwable cause;
                java.lang.String message;
                Intrinsics.checkNotNullParameter(faceLivenessDetectionException, "");
                pUU.KWHzl("kyc_in_house", "Face Liveness flow is name=" + faceLivenessDetectionException.getClass().getName() + " error=" + faceLivenessDetectionException.getThrowable() + " msg=" + faceLivenessDetectionException.getMessage() + " region=" + str + " poolId=" + str2);
                if (!pqd.AEQbTJ && pqd.isVisible() && !pqd.EZpvd) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(pqd), null, null, new EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1(faceLivenessDetectionException, pqd, eopLivenessBasicViewModel, null), 3, null);
                    java.lang.Throwable throwable = faceLivenessDetectionException.getThrowable();
                    if ((throwable != null ? throwable.getCause() : null) instanceof AuthException) {
                        C38274pSs.KWHzl.copydefault();
                    }
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("AWSCaptureSelfie_Failed", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return pQD.ActionBar.AnonymousClass2.KWHzl(faceLivenessDetectionException, str, str2, pqd, eopLivenessBasicViewModel, (EventParamsList) obj);
                        }
                    });
                    pqd.AEQbTJ = true;
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    android.content.Context contextRequireContext = pqd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    if (faceLivenessDetectionException instanceof FaceLivenessDetectionException.FaceInOvalMatchExceededTimeLimitException) {
                        viewOnClickListenerC54939xaY.setTitle(pqd.getString(C45508srO.Application.fIwbmz));
                        viewOnClickListenerC54939xaY.EZpvd(pqd.getString(C45508srO.Application.isConnected));
                    } else {
                        java.lang.Throwable throwable2 = faceLivenessDetectionException.getThrowable();
                        if (throwable2 != null && (cause = throwable2.getCause()) != null && (message = cause.getMessage()) != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "End video event received before first valid video event", false, 2, (java.lang.Object) null)) {
                            viewOnClickListenerC54939xaY.EZpvd(pqd.getString(C45508srO.Application.djBIcL));
                        } else {
                            viewOnClickListenerC54939xaY.EZpvd(pqd.getString(C45508srO.Application.fARcdN));
                        }
                        viewOnClickListenerC54939xaY.setTitle(pqd.getString(C45508srO.Application.AuCTel));
                    }
                    java.lang.String string = pqd.getString(C45508srO.Application.AYXKKw);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.pQL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            pQD.ActionBar.AnonymousClass2.OLrzqt(pqd, eopLivenessBasicViewModel, booleanRef, viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.pQO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            pQD.ActionBar.AnonymousClass2.EZpvd(booleanRef, eopLivenessBasicViewModel, pqd, dialogInterface);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                    return;
                }
                pUU.KWHzl("kyc_in_house", "showErrorDialog=" + pqd.AEQbTJ + "  isVisible=" + pqd.isVisible() + " isGettingLivenessResult=" + pqd.EZpvd);
            }

            public static final Unit KWHzl(FaceLivenessDetectionException faceLivenessDetectionException, java.lang.String str, java.lang.String str2, pQD pqd, EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "msg", "error=" + faceLivenessDetectionException.getThrowable() + " msg=" + faceLivenessDetectionException.getMessage(), false, 4, null);
                java.lang.String name = faceLivenessDetectionException.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                EventParamsList.put$default(eventParamsList, "name", name, false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_THROWABLE, java.lang.String.valueOf(faceLivenessDetectionException.getThrowable()), false, 4, null);
                EventParamsList.put$default(eventParamsList, "message", faceLivenessDetectionException.getMessage(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "param", "region=" + str + " poolId=" + str2, false, 4, null);
                EventParamsList.put$default(eventParamsList, "status", "state=" + faceLivenessDetectionException.getLivenessCheckState() + " runningFreshness=" + faceLivenessDetectionException.getRunningFreshness(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqd.EZpvd(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "flow_source", pqd.KWHzl(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, pqd.AEQbTJ(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, eopLivenessBasicViewModel.zsXlph() ? "true" : "false", false, 4, null);
                return Unit.INSTANCE;
            }

            public static final void OLrzqt(final pQD pqd, final EopLivenessBasicViewModel eopLivenessBasicViewModel, Ref.BooleanRef booleanRef, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("AWSCaptureSelfie_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pQD.ActionBar.AnonymousClass2.AEQbTJ(pqd, eopLivenessBasicViewModel, (EventParamsList) obj);
                    }
                });
                pUU.KWHzl("kyc_in_house", "AWSCaptureSelfie_Full_Button_Click try again");
                if (pqd.isVisible()) {
                    pRV<java.lang.String> prvFARcdN = eopLivenessBasicViewModel.fARcdN();
                    LifecycleOwner viewLifecycleOwner = pqd.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    C43733rup.copydefault(prvFARcdN, viewLifecycleOwner, new Function1() { // from class: o.pQG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return pQD.ActionBar.AnonymousClass2.AEQbTJ(eopLivenessBasicViewModel, pqd, (java.lang.String) obj);
                        }
                    });
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(pqd), null, null, new EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$3$1$3(eopLivenessBasicViewModel, viewOnClickListenerC54939xaY, pqd, null), 3, null);
                    pqd.showLoadingAtOnce();
                }
                booleanRef.element = true;
                viewOnClickListenerC54939xaY.dismiss();
            }

            public static final Unit AEQbTJ(pQD pqd, EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "try again", false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqd.EZpvd(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "flow_source", pqd.KWHzl(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, pqd.AEQbTJ(), false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, eopLivenessBasicViewModel.zsXlph() ? "true" : "false", false, 4, null);
                return Unit.INSTANCE;
            }

            public static final Unit AEQbTJ(EopLivenessBasicViewModel eopLivenessBasicViewModel, pQD pqd, java.lang.String str) {
                EopLivenessBasicViewModel.TaskDescription taskDescription = EopLivenessBasicViewModel.Companion;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.KWHzl())) {
                    eopLivenessBasicViewModel.djBIcL("AWS_SCAN_ON_ERROR_RETRY");
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.copydefault())) {
                    eopLivenessBasicViewModel.copydefault(pqd.getTAG());
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.OLrzqt())) {
                    eopLivenessBasicViewModel.djBIcL("AWS_SCAN_ON_ERROR_RETRY_WITH_LCA");
                }
                return Unit.INSTANCE;
            }

            public static final void EZpvd(Ref.BooleanRef booleanRef, EopLivenessBasicViewModel eopLivenessBasicViewModel, pQD pqd, android.content.DialogInterface dialogInterface) {
                if (booleanRef.element) {
                    return;
                }
                eopLivenessBasicViewModel.copydefault(pqd.getTAG());
            }
        }
    }
}
