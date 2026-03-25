package o;

import android.os.Build;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.SupportService;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams;
import com.okinc.ok_kyc_core.presentation.views.accountMerge.ComplianceAccountMergeActivity$callSupportEntrance$1;
import com.okinc.ok_kyc_core.presentation.views.accountMerge.ComplianceAccountMergeActivity$onCreate$7;
import com.okinc.ok_kyc_core.presentation.views.accountMerge.ComplianceAccountMergeActivity$setSecondOnClick$1$1$1;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import o.rQU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rQV extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public AbstractC43750rvF EZpvd;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rRb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return rQV.AEQbTJ(this.EZpvd);
        }
    });
    public SupportService copydefault;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ComplianceTheme.values().length];
            try {
                iArr[ComplianceTheme.OKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ComplianceTheme.OKX_LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rQV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull AccountMergeActionParams accountMergeActionParams) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(accountMergeActionParams, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) rQV.class);
            intent.putExtra("AccountMergeActionParams", accountMergeActionParams);
            context.startActivity(intent);
        }
    }

    public final AccountMergeActionParams AEQbTJ() {
        return (AccountMergeActionParams) this.OLrzqt.getValue();
    }

    public static final AccountMergeActionParams AEQbTJ(rQV rqv) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (AccountMergeActionParams) rqv.getIntent().getParcelableExtra("AccountMergeActionParams", AccountMergeActionParams.class);
        }
        return (AccountMergeActionParams) rqv.getIntent().getParcelableExtra("AccountMergeActionParams");
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        C52794wYp c52794wYp5;
        C52794wYp c52794wYp6;
        C52794wYp c52794wYp7;
        C52794wYp c52794wYp8;
        C52794wYp c52794wYp9;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        C42274rMu c42274rMu;
        AbstractC43977rzU abstractC43977rzU;
        super.onCreate(bundle);
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        ComplianceTheme complianceThemeCopydefault = rsf != null ? rsf.copydefault() : null;
        int i = complianceThemeCopydefault == null ? -1 : StateListAnimator.KWHzl[complianceThemeCopydefault.ordinal()];
        if (i == 1) {
            setTheme(C43662rtX.FragmentManager.copydefault);
        } else if (i == 2) {
            setTheme(C43662rtX.FragmentManager.EZpvd);
        }
        C43693ruB.OLrzqt("KYC_MergeAccount_Page_View");
        this.EZpvd = (AbstractC43750rvF) DataBindingUtil.setContentView(this, C43662rtX.TaskDescription.OLrzqt);
        getOnBackPressedDispatcher().addCallback(this, new Fragment());
        AbstractC43750rvF abstractC43750rvF = this.EZpvd;
        if (abstractC43750rvF != null && (abstractC43977rzU = abstractC43750rvF.djBIcL) != null) {
            android.widget.ImageView imageView = abstractC43977rzU.AEQbTJ;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.widget.ImageButton imageButton = abstractC43977rzU.KWHzl;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            android.widget.ImageView imageView2 = abstractC43977rzU.AEQbTJ;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.rQY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        rQV.EZpvd(this.EZpvd, view);
                    }
                });
            }
        }
        AbstractC43750rvF abstractC43750rvF2 = this.EZpvd;
        if (abstractC43750rvF2 != null && (c42274rMu = abstractC43750rvF2.KWHzl) != null) {
            C42274rMu.bindData$default(c42274rMu, C33070mpX.AYXKKw(C43662rtX.Dialog.AxsJAY), C33070mpX.AYXKKw(C43662rtX.Dialog.sSMYrx), null, null, null, null, null, 124, null);
        }
        AccountMergeActionParams accountMergeActionParamsAEQbTJ = AEQbTJ();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (accountMergeActionParamsAEQbTJ != null ? accountMergeActionParamsAEQbTJ.getCertifiedPhone() : null))) {
            AbstractC43750rvF abstractC43750rvF3 = this.EZpvd;
            if (abstractC43750rvF3 != null && (textView6 = abstractC43750rvF3.valueOf) != null) {
                AccountMergeActionParams accountMergeActionParamsAEQbTJ2 = AEQbTJ();
                textView6.setText(accountMergeActionParamsAEQbTJ2 != null ? accountMergeActionParamsAEQbTJ2.getCertifiedPhone() : null);
            }
        } else {
            AbstractC43750rvF abstractC43750rvF4 = this.EZpvd;
            if (abstractC43750rvF4 != null && (textView2 = abstractC43750rvF4.valueOf) != null) {
                textView2.setVisibility(8);
            }
            AbstractC43750rvF abstractC43750rvF5 = this.EZpvd;
            if (abstractC43750rvF5 != null && (textView = abstractC43750rvF5.AYXKKw) != null) {
                textView.setVisibility(8);
            }
        }
        AccountMergeActionParams accountMergeActionParamsAEQbTJ3 = AEQbTJ();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (accountMergeActionParamsAEQbTJ3 != null ? accountMergeActionParamsAEQbTJ3.getCertifiedEmail() : null))) {
            AbstractC43750rvF abstractC43750rvF6 = this.EZpvd;
            if (abstractC43750rvF6 != null && (textView5 = abstractC43750rvF6.EZpvd) != null) {
                AccountMergeActionParams accountMergeActionParamsAEQbTJ4 = AEQbTJ();
                textView5.setText(accountMergeActionParamsAEQbTJ4 != null ? accountMergeActionParamsAEQbTJ4.getCertifiedEmail() : null);
            }
        } else {
            AbstractC43750rvF abstractC43750rvF7 = this.EZpvd;
            if (abstractC43750rvF7 != null && (textView4 = abstractC43750rvF7.EZpvd) != null) {
                textView4.setVisibility(8);
            }
            AbstractC43750rvF abstractC43750rvF8 = this.EZpvd;
            if (abstractC43750rvF8 != null && (textView3 = abstractC43750rvF8.AEQbTJ) != null) {
                textView3.setVisibility(8);
            }
        }
        AbstractC43750rvF abstractC43750rvF9 = this.EZpvd;
        if (abstractC43750rvF9 != null && (c52794wYp9 = abstractC43750rvF9.OLrzqt) != null) {
            c52794wYp9.setOKDSType(257);
        }
        AccountMergeActionParams accountMergeActionParamsAEQbTJ5 = AEQbTJ();
        if (accountMergeActionParamsAEQbTJ5 == null || !Intrinsics.EZpvd(accountMergeActionParamsAEQbTJ5.isGreaterThan10U(), java.lang.Boolean.TRUE)) {
            AbstractC43750rvF abstractC43750rvF10 = this.EZpvd;
            if (abstractC43750rvF10 != null && (c52794wYp4 = abstractC43750rvF10.OLrzqt) != null) {
                c52794wYp4.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.aUsmxb));
            }
            AbstractC43750rvF abstractC43750rvF11 = this.EZpvd;
            if (abstractC43750rvF11 != null && (c52794wYp3 = abstractC43750rvF11.copydefault) != null) {
                c52794wYp3.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.QwvEab));
            }
            AbstractC43750rvF abstractC43750rvF12 = this.EZpvd;
            if (abstractC43750rvF12 != null && (c52794wYp2 = abstractC43750rvF12.OLrzqt) != null) {
                c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
            }
            AbstractC43750rvF abstractC43750rvF13 = this.EZpvd;
            if (abstractC43750rvF13 != null && (c52794wYp = abstractC43750rvF13.copydefault) != null) {
                c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
            }
        } else {
            AbstractC43750rvF abstractC43750rvF14 = this.EZpvd;
            if (abstractC43750rvF14 != null && (c52794wYp8 = abstractC43750rvF14.OLrzqt) != null) {
                c52794wYp8.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.QVsKAR));
            }
            AbstractC43750rvF abstractC43750rvF15 = this.EZpvd;
            if (abstractC43750rvF15 != null && (c52794wYp7 = abstractC43750rvF15.copydefault) != null) {
                c52794wYp7.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.USBtdM));
            }
            AbstractC43750rvF abstractC43750rvF16 = this.EZpvd;
            if (abstractC43750rvF16 != null && (c52794wYp6 = abstractC43750rvF16.OLrzqt) != null) {
                c52794wYp6.setOnClickListener(new Activity(c52794wYp6, 1000L, this));
            }
            AbstractC43750rvF abstractC43750rvF17 = this.EZpvd;
            if (abstractC43750rvF17 != null && (c52794wYp5 = abstractC43750rvF17.copydefault) != null) {
                c52794wYp5.setOnClickListener(new ActionBar(c52794wYp5, 1000L, this));
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ComplianceAccountMergeActivity$onCreate$7(this, null), 3, null);
    }

    public static final class Fragment extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public Fragment() {
            super(true);
        }
    }

    public static final void EZpvd(rQV rqv, android.view.View view) {
        rqv.finish();
    }

    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager copydefault = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("question", "mine", true);
            java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
            eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        }
    }

    public static final class PendingIntent implements Function1<EventParamsList, Unit> {
        public static final PendingIntent copydefault = new PendingIntent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("question", "not mine", true);
            java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
            eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, Continuation<? super SupportService> continuation) throws java.lang.Throwable {
        ComplianceAccountMergeActivity$callSupportEntrance$1 complianceAccountMergeActivity$callSupportEntrance$1;
        java.lang.Object objM7377constructorimpl;
        SupportService supportService;
        if (continuation instanceof ComplianceAccountMergeActivity$callSupportEntrance$1) {
            complianceAccountMergeActivity$callSupportEntrance$1 = (ComplianceAccountMergeActivity$callSupportEntrance$1) continuation;
            int i = complianceAccountMergeActivity$callSupportEntrance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                complianceAccountMergeActivity$callSupportEntrance$1.label = i - Integer.MIN_VALUE;
            } else {
                complianceAccountMergeActivity$callSupportEntrance$1 = new ComplianceAccountMergeActivity$callSupportEntrance$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = complianceAccountMergeActivity$callSupportEntrance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = complianceAccountMergeActivity$callSupportEntrance$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            Result.Application application2 = Result.Companion;
            ChatBotRequest chatBotRequest = new ChatBotRequest();
            chatBotRequest.setOkaFrom("kyc");
            C6811aWS c6811aWS = new C6811aWS(str, chatBotRequest, null, null, 12, null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL == null) {
                supportService = null;
                objM7377constructorimpl = Result.m7377constructorimpl(supportService);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    return objM7377constructorimpl;
                }
                return null;
            }
            complianceAccountMergeActivity$callSupportEntrance$1.label = 1;
            objAEQbTJ = interfaceC6804aWL.AEQbTJ(c6811aWS, complianceAccountMergeActivity$callSupportEntrance$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        supportService = (SupportService) objAEQbTJ;
        objM7377constructorimpl = Result.m7377constructorimpl(supportService);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ rQV AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, rQV rqv) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = rqv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("KycReclaimAccount_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), PendingIntent.copydefault);
                rQV rqv = this.AEQbTJ;
                rqv.OLrzqt((android.content.Context) rqv);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ rQV OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rQV rqv) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = rqv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AccountMergeActionParams accountMergeActionParamsAEQbTJ = this.OLrzqt.AEQbTJ();
                if (accountMergeActionParamsAEQbTJ != null) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KycReclaimAccount_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), LoaderManager.copydefault);
                    rQU.TaskDescription taskDescription = rQU.Companion;
                    java.lang.String realName = accountMergeActionParamsAEQbTJ.getRealName();
                    if (realName == null) {
                        realName = "";
                    }
                    java.lang.String accountName = accountMergeActionParamsAEQbTJ.getAccountName();
                    taskDescription.copydefault(realName, accountName != null ? accountName : "").showNow(this.OLrzqt.getSupportFragmentManager(), "AccountMergeBottomSheet");
                }
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ rQV AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, rQV rqv) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = rqv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AccountMergeActionParams accountMergeActionParamsAEQbTJ = this.AEQbTJ.AEQbTJ();
                if (accountMergeActionParamsAEQbTJ != null) {
                    C43693ruB.OLrzqt("KYC_MergeAccount_CannotLogin_Click");
                    rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
                    rQV rqv = this.AEQbTJ;
                    java.lang.String realName = accountMergeActionParamsAEQbTJ.getRealName();
                    if (realName == null) {
                        realName = "";
                    }
                    java.lang.String accountName = accountMergeActionParamsAEQbTJ.getAccountName();
                    rsf.EZpvd(rqv, false, realName, accountName != null ? accountName : "");
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ rQV KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, rQV rqv) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = rqv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AccountMergeActionParams accountMergeActionParamsAEQbTJ = this.KWHzl.AEQbTJ();
                if (accountMergeActionParamsAEQbTJ != null) {
                    C43693ruB.OLrzqt("KYC_MergeAccount_Login_Click");
                    rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
                    rQV rqv = this.KWHzl;
                    java.lang.String realName = accountMergeActionParamsAEQbTJ.getRealName();
                    if (realName == null) {
                        realName = "";
                    }
                    java.lang.String accountName = accountMergeActionParamsAEQbTJ.getAccountName();
                    rsf.EZpvd(rqv, true, realName, accountName != null ? accountName : "");
                }
            }
        }
    }

    public final void OLrzqt(final android.content.Context context) {
        java.lang.String serviceLabel;
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C43662rtX.Dialog.fdOvFl));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.fERRXa));
        SupportService supportService = this.copydefault;
        if (supportService == null || (serviceLabel = supportService.getServiceLabel()) == null) {
            serviceLabel = "";
        }
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) serviceLabel, new View.OnClickListener() { // from class: o.rQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQV.EZpvd(viewOnClickListenerC54939xaY, this, context, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C43662rtX.Dialog.UlJrfe), new View.OnClickListener() { // from class: o.rRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQV.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, rQV rqv, android.content.Context context, android.view.View view) {
        C43693ruB.OLrzqt("KYC_MergeAccount_Customer_Click");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new ComplianceAccountMergeActivity$setSecondOnClick$1$1$1(rqv, context, null), 3, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
