package o;

import android.os.Build;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.eop.fragment.EopFaceGuideFragment$routeToNext$2;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.util.CdnResourceType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C38264pSi;
import o.C38270pSo;
import o.C45508srO;
import o.C52761wXj;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pQT extends AbstractC32996moC {
    public EopLivenessBasicViewModel AEQbTJ;
    public AbstractC45510srQ KWHzl;
    public final int EZpvd = C45508srO.Activity.EZpvd;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pRa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pQT.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public static final C43739ruv copydefault() {
        return new C43739ruv();
    }

    public final C43739ruv AEQbTJ() {
        return (C43739ruv) this.OLrzqt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        EopLivenessBasicViewModel eopLivenessBasicViewModel = (EopLivenessBasicViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(EopLivenessBasicViewModel.class);
        this.AEQbTJ = eopLivenessBasicViewModel;
        VendorConfig vendorConfigQKVWgx = eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.QKVWgx() : null;
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.AEQbTJ;
        java.lang.String strIsConnected = eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.isConnected() : null;
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.AEQbTJ;
        pUU.KWHzl("ViewModelTest", "EopFaceGuideFragment=" + vendorConfigQKVWgx + "-" + strIsConnected + "-" + (eopLivenessBasicViewModel3 != null ? eopLivenessBasicViewModel3.DTwDnp() : null));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC45510srQ abstractC45510srQKWHzl = AbstractC45510srQ.KWHzl(layoutInflater, viewGroup, false);
        this.KWHzl = abstractC45510srQKWHzl;
        if (abstractC45510srQKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC45510srQKWHzl = null;
        }
        return abstractC45510srQKWHzl.getRoot();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
    }

    public final AbstractC45510srQ OLrzqt() {
        AbstractC45510srQ abstractC45510srQ = this.KWHzl;
        if (abstractC45510srQ != null) {
            return abstractC45510srQ;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        VendorConfig vendorConfigQKVWgx;
        java.lang.String certificateTypeOnboarding;
        java.lang.String strIsConnected;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC45510srQ abstractC45510srQOLrzqt = OLrzqt();
        android.widget.TextView textView = abstractC45510srQOLrzqt.isConnected;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        textView.setContentDescription(eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.DTwDnp() : null);
        android.widget.ImageView imageView = abstractC45510srQOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C42458rTp.OLrzqt("images/compliance/selfie_guide.png", C32979mnm.EZpvd.OLrzqt(), CdnResourceType.Images, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C43739ruv c43739ruvAEQbTJ = AEQbTJ();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        c43739ruvAEQbTJ.KWHzl("ReadyTakeSelfie_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Function1() { // from class: o.pQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pQT.AEQbTJ(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        pUU.KWHzl("kyc_in_house", "ReadyTakeSelfie_Full_Page_View onCreate " + isConnected());
        if (isConnected()) {
            return;
        }
        C38209pQg c38209pQg = C38209pQg.copydefault;
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.AEQbTJ;
        java.lang.String str = (eopLivenessBasicViewModel2 == null || (strIsConnected = eopLivenessBasicViewModel2.isConnected()) == null) ? "" : strIsConnected;
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.AEQbTJ;
        C38209pQg.reportKycFlow$default(c38209pQg, "entrance_selfie", str, (eopLivenessBasicViewModel3 == null || (vendorConfigQKVWgx = eopLivenessBasicViewModel3.QKVWgx()) == null || (certificateTypeOnboarding = vendorConfigQKVWgx.getCertificateTypeOnboarding()) == null) ? "" : certificateTypeOnboarding, false, null, 24, null);
    }

    public static final Unit AEQbTJ(pQT pqt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "onCreate", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqt.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", pqt.fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, pqt.AhwBna(), false, 4, null);
        return Unit.INSTANCE;
    }

    private final void values() {
        OLrzqt(false);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        if (eopLivenessBasicViewModel != null) {
            eopLivenessBasicViewModel.getNewProxyInstance();
        }
    }

    public final void KWHzl(boolean z) {
        AbstractC45510srQ abstractC45510srQ = this.KWHzl;
        if (abstractC45510srQ == null) {
            Intrinsics.gEmmrt("");
            abstractC45510srQ = null;
        }
        C55317xhf c55317xhf = abstractC45510srQ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55317xhf, "");
        c55317xhf.setVisibility(z ? 0 : 8);
        OLrzqt(true);
        djBIcL();
    }

    public final boolean gEmmrt() {
        android.content.Context context = getContext();
        return context != null && C59449zhJ.gEmmrt(android.os.Build.BRAND, MTPushConstants.Manufacturer.OPPO, true) && Build.VERSION.SDK_INT == 28 && EZpvd(context);
    }

    public final boolean EZpvd(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        android.app.NotificationManager notificationManager = systemService instanceof android.app.NotificationManager ? (android.app.NotificationManager) systemService : null;
        return !(notificationManager != null && notificationManager.getCurrentInterruptionFilter() == 1);
    }

    public final void AYXKKw() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C45508srO.Application.AkhnZx));
        viewOnClickListenerC54939xaY.EZpvd(getString(C45508srO.Application.valueOf));
        java.lang.String string = getString(C45508srO.Application.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public final void djBIcL() {
        if (gEmmrt()) {
            AYXKKw();
            return;
        }
        if (EZpvd()) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C45508srO.Application.KWHzl));
        viewOnClickListenerC54939xaY.EZpvd(getString(C45508srO.Application.AEQbTJ));
        java.lang.String string = getString(C45508srO.Application.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public final boolean EZpvd() {
        android.content.Context context = getContext();
        if (context == null) {
            return true;
        }
        try {
            java.lang.Object systemService = context.getSystemService("camera");
            Intrinsics.copydefault(systemService, "");
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            for (java.lang.String str : cameraIdList) {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "");
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 0) {
                    return true;
                }
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("AWS_GUIDE_NO_CAMERA", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pQT.KWHzl(this.copydefault, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "no FrontCamera");
            return false;
        } catch (java.lang.Throwable th) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("AWS_GUIDE_CAMERA_ERROR", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pQT.copydefault(this.EZpvd, th, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "hasFrontCamera e=" + th);
            return false;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ pQT AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ AbstractC45510srQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, pQT pqt, AbstractC45510srQ abstractC45510srQ) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = pqt;
            this.copydefault = abstractC45510srQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.AEQbTJ.gEmmrt()) {
                    this.AEQbTJ.AYXKKw();
                } else if (!C33625mzw.OLrzqt().OLrzqt(this.AEQbTJ.requireActivity(), (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"android.permission.CAMERA"}, 1))) {
                    C60121zwJ.AEQbTJ(this.AEQbTJ.requireActivity(), this.AEQbTJ.getString(C45508srO.Application.copydefault), 3, "android.permission.CAMERA");
                } else {
                    C52794wYp.startLoading$default(this.copydefault.AEQbTJ, 0L, 1, null);
                    this.AEQbTJ.copydefault(this.copydefault);
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ pQT OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, pQT pqt) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = pqt;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.pSi.StateListAnimator.newInstance$default(o.pSi$StateListAnimator, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, int, java.lang.Object):o.pSi */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C38264pSi.StateListAnimator.newInstance$default(C38264pSi.Companion, this.OLrzqt.valueOf(), this.OLrzqt.fetchVPNInfo(), this.OLrzqt.AhwBna(), null, 8, null).show(this.OLrzqt.getParentFragmentManager(), "LivenessSecureTipBottomSheet");
            }
        }
    }

    public static final Unit copydefault(pQT pqt, java.lang.Throwable th, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqt.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "msg", th.toString(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(pQT pqt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqt.valueOf(), false, 4, null);
        return Unit.INSTANCE;
    }

    private final boolean isConnected() {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        if (eopLivenessBasicViewModel != null) {
            return eopLivenessBasicViewModel.RJOkX();
        }
        return false;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        LiveData<C43734ruq<java.lang.Boolean>> liveDataValues;
        LiveData<C43734ruq<java.lang.Boolean>> liveDataZLjUOn;
        LiveData<C43734ruq<java.lang.Boolean>> liveDataWlaJM;
        super.setListener();
        AbstractC45510srQ abstractC45510srQOLrzqt = OLrzqt();
        abstractC45510srQOLrzqt.OLrzqt.getBackImage().setOnClickListener(new View.OnClickListener() { // from class: o.pQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pQT.copydefault(this.KWHzl, view);
            }
        });
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        if (eopLivenessBasicViewModel != null && (liveDataWlaJM = eopLivenessBasicViewModel.wlaJM()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C43733rup.copydefault(liveDataWlaJM, viewLifecycleOwner, new Function1() { // from class: o.pQX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pQT.AhwBna(this.AEQbTJ, (C43734ruq) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.AEQbTJ;
        if (eopLivenessBasicViewModel2 != null && (liveDataZLjUOn = eopLivenessBasicViewModel2.zLjUOn()) != null) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            C43733rup.copydefault(liveDataZLjUOn, viewLifecycleOwner2, new Function1() { // from class: o.pQY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pQT.OLrzqt(this.KWHzl, (C43734ruq) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.AEQbTJ;
        if (eopLivenessBasicViewModel3 != null && (liveDataValues = eopLivenessBasicViewModel3.values()) != null) {
            LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
            C43733rup.copydefault(liveDataValues, viewLifecycleOwner3, new Function1() { // from class: o.pRd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pQT.KWHzl(this.OLrzqt, (C43734ruq) obj);
                }
            });
        }
        C52794wYp c52794wYp = abstractC45510srQOLrzqt.AEQbTJ;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, abstractC45510srQOLrzqt));
        AbstractC45510srQ abstractC45510srQ = this.KWHzl;
        if (abstractC45510srQ == null) {
            Intrinsics.gEmmrt("");
            abstractC45510srQ = null;
        }
        C55317xhf c55317xhf = abstractC45510srQ.djBIcL;
        c55317xhf.setOnClickListener(new StateListAnimator(c55317xhf, 1000L, this));
        java.lang.String string = getString(C45508srO.Application.gEmmrt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        abstractC45510srQOLrzqt.values.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(this, C45508srO.Application.AhwBna, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("learnMore", string))), new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.pRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pQT.copydefault(this.copydefault, (java.util.List) obj);
            }
        }, 14, null));
        abstractC45510srQOLrzqt.values.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static final void copydefault(pQT pqt, android.view.View view) {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = pqt.AEQbTJ;
        if (eopLivenessBasicViewModel != null) {
            eopLivenessBasicViewModel.copydefault("FACE_USER_CANCEL");
        }
    }

    public static final Unit AhwBna(pQT pqt, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.Boolean bool = (java.lang.Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            pqt.copydefault(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(pQT pqt, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.Boolean bool = (java.lang.Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            pqt.EZpvd(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(pQT pqt, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.Boolean bool = (java.lang.Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            pqt.KWHzl(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.pSo.StateListAnimator.newInstance$default(o.pSo$StateListAnimator, android.os.Bundle, int, java.lang.Object):o.pSo */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C38270pSo.StateListAnimator.newInstance$default(C38270pSo.Companion, null, 1, null).show(pQT.this.getParentFragmentManager(), "SelfieLearnMoreBottomSheet");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            android.content.Context context = pQT.this.getContext();
            if (context == null) {
                return;
            }
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
            textPaint.setStrokeWidth(12.0f);
        }
    }

    public static final Unit copydefault(pQT pqt, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(pqt.new Activity());
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractC45510srQ abstractC45510srQ) {
        pRV<java.lang.String> prvFARcdN;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        if (eopLivenessBasicViewModel != null && (prvFARcdN = eopLivenessBasicViewModel.fARcdN()) != null) {
            C43733rup.copydefault(prvFARcdN, this, new Function1() { // from class: o.pQZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pQT.EZpvd(this.EZpvd, abstractC45510srQ, (java.lang.String) obj);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EopFaceGuideFragment$routeToNext$2(this, abstractC45510srQ, null), 3, null);
    }

    public static final Unit EZpvd(final pQT pqt, AbstractC45510srQ abstractC45510srQ, java.lang.String str) {
        C43739ruv c43739ruvAEQbTJ = pqt.AEQbTJ();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        c43739ruvAEQbTJ.KWHzl("ReadyTakeSelfie_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Function1() { // from class: o.pQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pQT.djBIcL(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        pUU.KWHzl("kyc_in_house", "ReadyTakeSelfie_Full_Button_Click next " + pqt.isConnected());
        EopLivenessBasicViewModel.TaskDescription taskDescription = EopLivenessBasicViewModel.Companion;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.KWHzl())) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel = pqt.AEQbTJ;
            if (eopLivenessBasicViewModel != null) {
                eopLivenessBasicViewModel.djBIcL(pqt.getTAG());
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.copydefault())) {
            abstractC45510srQ.AEQbTJ.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(pQT pqt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "next", true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, pqt.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", pqt.fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, pqt.AhwBna(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        AbstractC45510srQ abstractC45510srQOLrzqt = OLrzqt();
        if (z) {
            C52794wYp.startLoading$default(abstractC45510srQOLrzqt.AEQbTJ, 0L, 1, null);
        } else {
            abstractC45510srQOLrzqt.AEQbTJ.fIwbmz();
        }
    }

    public final void OLrzqt(boolean z) {
        AbstractC45510srQ abstractC45510srQ = this.KWHzl;
        AbstractC45510srQ abstractC45510srQ2 = null;
        if (abstractC45510srQ == null) {
            Intrinsics.gEmmrt("");
            abstractC45510srQ = null;
        }
        android.widget.LinearLayout linearLayout = abstractC45510srQ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
        AbstractC45510srQ abstractC45510srQ3 = this.KWHzl;
        if (abstractC45510srQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC45510srQ2 = abstractC45510srQ3;
        }
        LottieAnimationView lottieAnimationView = abstractC45510srQ2.valueOf;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(z ^ true ? 0 : 8);
    }

    public final void copydefault(boolean z) {
        pUU.KWHzl("qjf", "eop face guide switchGuideOrLoading=" + z);
        AbstractC45510srQ abstractC45510srQOLrzqt = OLrzqt();
        if (z) {
            android.widget.FrameLayout frameLayout = abstractC45510srQOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            if (frameLayout.getVisibility() == 0) {
                return;
            }
            abstractC45510srQOLrzqt.copydefault.setVisibility(0);
            abstractC45510srQOLrzqt.AYXKKw.setAutoMirrored(true);
            abstractC45510srQOLrzqt.AYXKKw.KWHzl(0L);
            abstractC45510srQOLrzqt.gEmmrt.setVisibility(8);
            return;
        }
        abstractC45510srQOLrzqt.gEmmrt.setVisibility(0);
        abstractC45510srQOLrzqt.AYXKKw.copydefault();
        abstractC45510srQOLrzqt.copydefault.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String valueOf() {
        java.lang.String strIsConnected;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        return (eopLivenessBasicViewModel == null || (strIsConnected = eopLivenessBasicViewModel.isConnected()) == null) ? "" : strIsConnected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fetchVPNInfo() {
        java.lang.String strOcIXYQ;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        return (eopLivenessBasicViewModel == null || (strOcIXYQ = eopLivenessBasicViewModel.OcIXYQ()) == null) ? "" : strOcIXYQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AhwBna() {
        java.lang.String strORxRYg;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.AEQbTJ;
        return (eopLivenessBasicViewModel == null || (strORxRYg = eopLivenessBasicViewModel.ORxRYg()) == null) ? "" : strORxRYg;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
