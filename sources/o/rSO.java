package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeAvailableBean;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderGroupBean;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C43662rtX;
import o.C52761wXj;
import o.InterfaceC43702ruK;

/* JADX INFO: loaded from: classes23.dex */
public final class rSO extends AbstractActivityC33044moy<AbstractC43755rvK> {
    public long OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final java.util.ArrayList<ExchangeReminderGroupBean> AEQbTJ = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C43662rtX.TaskDescription.AEQbTJ;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rSO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.ArrayList<ExchangeReminderGroupBean> OLrzqt() {
            return rSO.AEQbTJ;
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AppCompatTextView appCompatTextView = KWHzl().copydefault;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
        KWHzl().AEQbTJ.setOKDSType(257);
        C52794wYp c52794wYp = KWHzl().AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        java.lang.String string = getString(C43662rtX.Dialog.getNewProxyInstance);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = C33069mpW.KWHzl(this, C43662rtX.Dialog.getFieldNames, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("learnmore", string))) + "\u200b";
        KWHzl().EZpvd.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        KWHzl().EZpvd.setText(C33574myy.setupSpanStyles$default(str, new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.rSY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSO.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }, 14, null));
        copydefault();
    }

    public static final class StateListAnimator implements Function1<ExchangeReminderBean, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ExchangeReminderBean exchangeReminderBean) {
            KWHzl(exchangeReminderBean);
            return Unit.INSTANCE;
        }

        public final void KWHzl(ExchangeReminderBean exchangeReminderBean) {
            Intrinsics.checkNotNullParameter(exchangeReminderBean, "");
            AbstractC43755rvK abstractC43755rvKKWHzl = rSO.this.KWHzl();
            rSO rso = rSO.this;
            AbstractC43755rvK abstractC43755rvK = abstractC43755rvKKWHzl;
            abstractC43755rvK.copydefault.setText(exchangeReminderBean.getExchangeName());
            abstractC43755rvK.copydefault.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, rso));
            abstractC43755rvK.copydefault.setBackgroundResource(C43662rtX.Activity.djBIcL);
            abstractC43755rvK.KWHzl.setVisibility(8);
            rso.OLrzqt = exchangeReminderBean.getId();
            abstractC43755rvK.AEQbTJ.setEnabled(true);
        }
    }

    public static final Unit OLrzqt(rSO rso, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(rso, C32113mPz.Dialog.OcIXYQ));
        list.add(new android.text.style.ForegroundColorSpan(rso.getColor(C52761wXj.Activity.Dmq)));
        list.add(rso.new TaskDescription());
        return Unit.INSTANCE;
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public TaskDescription() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.String string = rSO.this.getString(C43662rtX.Dialog.hDKMBd);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, rSO.this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", string)), null, 4, null);
        }
    }

    public final void copydefault() {
        showLoading();
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).AEQbTJ(), this));
        final Function1 function1 = new Function1() { // from class: o.rSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSO.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSO.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSO.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSO.djBIcL(function12, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(rSO rso, ResponseData responseData) {
        rso.dismissLoading();
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.util.ArrayList<ExchangeReminderGroupBean> arrayList = AEQbTJ;
            arrayList.clear();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            arrayList.addAll((java.util.Collection) data);
        } else {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
            pUU.KWHzl(rso.getTAG(), "getExchangeList fail " + responseData);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(rSO rso, java.lang.Throwable th) {
        rso.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        pUU.KWHzl(rso.getTAG(), "getExchangeList error=" + th);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0, new android.content.Intent());
        finish();
    }

    public final void EZpvd() {
        C52794wYp.startLoading$default(KWHzl().AEQbTJ, 0L, 1, null);
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).OLrzqt(this.OLrzqt), this));
        final Function1 function1 = new Function1() { // from class: o.rSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSO.KWHzl(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSO.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSO.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSO.KWHzl(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(rSO rso, ResponseData responseData) {
        rso.KWHzl().AEQbTJ.fIwbmz();
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((ExchangeAvailableBean) data).getAvailable()) {
                rso.setResult(-1, new android.content.Intent());
                rso.finish();
            } else {
                AbstractC43755rvK abstractC43755rvKKWHzl = rso.KWHzl();
                abstractC43755rvKKWHzl.AEQbTJ.setEnabled(false);
                abstractC43755rvKKWHzl.copydefault.setBackgroundResource(C43662rtX.Activity.AYXKKw);
                abstractC43755rvKKWHzl.KWHzl.setVisibility(0);
            }
        } else {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
            pUU.KWHzl(rso.getTAG(), "getExchangeAvailable fail " + responseData);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ rSO OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rSO rso) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = rso;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.EZpvd();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ rSO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rSO rso) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = rso;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (!C33129mqd.KWHzl((java.util.Collection) rSO.AEQbTJ)) {
                    this.OLrzqt.copydefault();
                    return;
                }
                rSG rsgOLrzqt = rSG.Companion.OLrzqt();
                rsgOLrzqt.KWHzl(this.OLrzqt.new StateListAnimator());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                rsgOLrzqt.show(supportFragmentManager);
            }
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(rSO rso, java.lang.Throwable th) {
        rso.KWHzl().AEQbTJ.fIwbmz();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        pUU.KWHzl(rso.getTAG(), "getExchangeAvailable error=" + th);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AEQbTJ.clear();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
