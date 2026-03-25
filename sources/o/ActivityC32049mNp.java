package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.debugbox.doh.DebugDohItemBean;
import io.reactivex.BackpressureStrategy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31976mKx;
import o.mNB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC32049mNp extends AbstractActivityC33041mov {
    public mMW AEQbTJ;
    public java.lang.String EZpvd = "ProcessLog: \n";
    public AtomicBoolean KWHzl = new AtomicBoolean(false);
    public java.util.ArrayList<DebugDohItemBean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull mMW mmw) {
        Intrinsics.checkNotNullParameter(mmw, "");
        this.AEQbTJ = mmw;
    }

    @Override // o.AbstractActivityC33041mov
    public boolean needChangeLang() {
        return false;
    }

    public final mMW AEQbTJ() {
        mMW mmw = this.AEQbTJ;
        if (mmw != null) {
            return mmw;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault((mMW) DataBindingUtil.setContentView(this, C31976mKx.Application.AYXKKw));
        AEQbTJ().djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.mNw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC32049mNp.EZpvd(this.AEQbTJ, view);
            }
        });
        AEQbTJ().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.mNt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC32049mNp.OLrzqt(this.KWHzl, view);
            }
        });
        AEQbTJ().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mNu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC32049mNp.gEmmrt(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(ActivityC32049mNp activityC32049mNp, android.view.View view) {
        activityC32049mNp.finish();
    }

    public static final void OLrzqt(final ActivityC32049mNp activityC32049mNp, android.view.View view) {
        if (activityC32049mNp.KWHzl.get()) {
            C55328xhq.show$default(C33605mzc.AEQbTJ(), "Processing for now, please wait...", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        activityC32049mNp.OLrzqt("");
        activityC32049mNp.KWHzl = new AtomicBoolean(true);
        activityC32049mNp.OLrzqt = null;
        C52794wYp.startLoading$default(activityC32049mNp.AEQbTJ().copydefault, 0L, 1, null);
        AbstractC58185ywX<java.util.ArrayList<DebugDohItemBean>> abstractC58185ywXCopydefault = activityC32049mNp.copydefault();
        final Function1 function1 = new Function1() { // from class: o.mNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32049mNp.KWHzl(this.KWHzl, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.ArrayList<DebugDohItemBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC32049mNp.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mNA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32049mNp.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mNz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC32049mNp.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC32049mNp activityC32049mNp, java.util.ArrayList arrayList) {
        pUU.EZpvd(activityC32049mNp.getTAG(), "processInputConfigAsync result : " + arrayList + " ");
        activityC32049mNp.KWHzl = new AtomicBoolean(false);
        activityC32049mNp.OLrzqt = arrayList;
        activityC32049mNp.EZpvd();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC32049mNp activityC32049mNp, java.lang.Throwable th) {
        pUU.valueOf(activityC32049mNp.getTAG(), "processInputConfigAsync error: " + th + " ");
        activityC32049mNp.KWHzl = new AtomicBoolean(false);
        activityC32049mNp.EZpvd();
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(ActivityC32049mNp activityC32049mNp, android.view.View view) {
        if (activityC32049mNp.KWHzl()) {
            mNB.TaskDescription taskDescription = mNB.Companion;
            java.util.ArrayList<DebugDohItemBean> arrayList = activityC32049mNp.OLrzqt;
            Intrinsics.copydefault(arrayList);
            taskDescription.KWHzl(arrayList);
            activityC32049mNp.setResult(-1);
            activityC32049mNp.finish();
            return;
        }
        C55328xhq.show$default(C33605mzc.AEQbTJ(), "Parse Result is failed, can't import config", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<java.util.ArrayList<DebugDohItemBean>> copydefault() {
        AbstractC58185ywX<java.util.ArrayList<DebugDohItemBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.mNs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                ActivityC32049mNp.EZpvd(this.AEQbTJ, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(ActivityC32049mNp activityC32049mNp, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            java.util.ArrayList<DebugDohItemBean> arrayListOLrzqt = activityC32049mNp.OLrzqt();
            if (arrayListOLrzqt != null && (!arrayListOLrzqt.isEmpty())) {
                interfaceC58184ywW.onNext(arrayListOLrzqt);
            } else {
                interfaceC58184ywW.onError(new java.lang.Throwable("list is null"));
            }
            interfaceC58184ywW.onComplete();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            interfaceC58184ywW.onError(e);
            interfaceC58184ywW.onComplete();
        }
    }

    public final java.util.ArrayList<DebugDohItemBean> OLrzqt() {
        this.EZpvd = "";
        android.text.Editable text = AEQbTJ().gEmmrt.getText();
        java.lang.String string = text != null ? text.toString() : null;
        pUU.KWHzl(getTAG(), "processInputConfig inputJson: " + string);
        if (string == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            this.EZpvd = this.EZpvd + "error: input is null! \n";
            return null;
        }
        try {
            java.util.List listAEQbTJ = C33490mxT.AEQbTJ(string, DebugDohItemBean.class);
            Intrinsics.copydefault(listAEQbTJ, "");
            java.util.ArrayList<DebugDohItemBean> arrayList = (java.util.ArrayList) listAEQbTJ;
            if (arrayList.isEmpty()) {
                this.EZpvd = this.EZpvd + "error: parse doh list is empty! \n";
                return null;
            }
            java.util.Iterator<DebugDohItemBean> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                DebugDohItemBean next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                DebugDohItemBean debugDohItemBean = next;
                java.lang.String str = mNB.Companion.OLrzqt(debugDohItemBean) ? "parse success == " : "unknown dohType -- ";
                this.EZpvd = this.EZpvd + str + debugDohItemBean + "\n";
                C43365rns c43365rns = C43365rns.OLrzqt;
                java.lang.String strKWHzl = c43365rns.KWHzl(1, debugDohItemBean.getIp());
                java.lang.String strKWHzl2 = c43365rns.KWHzl(strKWHzl);
                pUU.EZpvd(getTAG(), "ping result ip: " + strKWHzl2);
                if (strKWHzl2 != null) {
                    debugDohItemBean.setIp(strKWHzl2);
                }
                this.EZpvd = this.EZpvd + "pingResult:\n " + strKWHzl + "\n\n";
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            this.EZpvd = this.EZpvd + "error: " + e + " \n";
            return null;
        }
    }

    private final void EZpvd() {
        updateLog$default(this, null, 1, null);
        AEQbTJ().AYXKKw.setText("Result: " + (KWHzl() ? "Success" : "Failed"));
        AEQbTJ().copydefault.fIwbmz();
    }

    public static /* synthetic */ void updateLog$default(ActivityC32049mNp activityC32049mNp, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityC32049mNp.EZpvd;
        }
        activityC32049mNp.OLrzqt(str);
    }

    public final void OLrzqt(java.lang.String str) {
        AEQbTJ().AEQbTJ.setText(str);
    }

    public final boolean KWHzl() {
        if (this.OLrzqt != null) {
            return !r0.isEmpty();
        }
        return false;
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
