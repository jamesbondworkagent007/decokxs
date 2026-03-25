package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import o.AbstractC33586mzJ;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.exA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17135exA extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public AbstractC16313eha EZpvd;
    public AbstractC33586mzJ djBIcL;
    public java.lang.String valueOf = "";
    public java.lang.String copydefault = "";
    public long AEQbTJ = -1;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.exD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17135exA.OLrzqt();
        }
    });

    /* JADX INFO: renamed from: o.exA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.exA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) ActivityC17135exA.class));
        }
    }

    public final java.util.ArrayList<C33583mzG> EZpvd() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList OLrzqt() {
        java.util.List<C10854bwM> listDjBIcL = C10954byG.EZpvd.valueOf().djBIcL();
        java.util.ArrayList<C10854bwM> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listDjBIcL) {
            C10854bwM c10854bwM = (C10854bwM) obj;
            if (c10854bwM.QkdxfA() || c10854bwM.run() || c10854bwM.call() || c10854bwM.fARcdN()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C10854bwM c10854bwM2 : arrayList) {
            C33600mzX c33600mzX = new C33600mzX();
            c33600mzX.AEQbTJ(c10854bwM2.djBIcL());
            c33600mzX.KWHzl(java.lang.Long.valueOf(c10854bwM2.QKVWgx()));
            arrayList2.add(c33600mzX);
        }
        return new java.util.ArrayList(arrayList2);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16313eha abstractC16313eha = (AbstractC16313eha) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.iwGUEr);
        this.EZpvd = abstractC16313eha;
        AbstractC16313eha abstractC16313eha2 = null;
        if (abstractC16313eha == null) {
            Intrinsics.gEmmrt("");
            abstractC16313eha = null;
        }
        abstractC16313eha.OLrzqt.setTitle("Decode raw transaction");
        copydefault();
        AbstractC16313eha abstractC16313eha3 = this.EZpvd;
        if (abstractC16313eha3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16313eha3 = null;
        }
        abstractC16313eha3.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.exx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17135exA.AEQbTJ(this.KWHzl, view);
            }
        });
        AbstractC16313eha abstractC16313eha4 = this.EZpvd;
        if (abstractC16313eha4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16313eha4 = null;
        }
        AppCompatEditText appCompatEditText = abstractC16313eha4.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "");
        C33606mzd.AEQbTJ(appCompatEditText, new Function1() { // from class: o.exB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17135exA.AEQbTJ(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
        AbstractC16313eha abstractC16313eha5 = this.EZpvd;
        if (abstractC16313eha5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16313eha5 = null;
        }
        abstractC16313eha5.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.exG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17135exA.EZpvd(this.OLrzqt, view);
            }
        });
        AbstractC16313eha abstractC16313eha6 = this.EZpvd;
        if (abstractC16313eha6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16313eha2 = abstractC16313eha6;
        }
        abstractC16313eha2.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.exE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17135exA.AYXKKw(this.AEQbTJ, view);
            }
        });
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.exC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17135exA.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(ActivityC17135exA activityC17135exA, android.view.View view) {
        AbstractC33586mzJ abstractC33586mzJ = activityC17135exA.djBIcL;
        if (abstractC33586mzJ == null) {
            Intrinsics.gEmmrt("");
            abstractC33586mzJ = null;
        }
        Intrinsics.copydefault(view);
        AbstractC33586mzJ.show$default(abstractC33586mzJ, view, false, 0, null, 0, 30, null);
    }

    public static final Unit AEQbTJ(ActivityC17135exA activityC17135exA, java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        activityC17135exA.valueOf = string;
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC17135exA activityC17135exA, android.view.View view) {
        java.lang.Object systemService = activityC17135exA.getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, activityC17135exA.copydefault));
        java.lang.String string = activityC17135exA.getString(C13754dXa.FragmentManager.message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public static final void AYXKKw(ActivityC17135exA activityC17135exA, android.view.View view) {
        if (activityC17135exA.valueOf.length() > 0) {
            long j = activityC17135exA.AEQbTJ;
            if (j != -1) {
                java.lang.String strEZpvd = xYW.AEQbTJ.EZpvd(activityC17135exA.valueOf, j);
                activityC17135exA.copydefault = strEZpvd;
                AbstractC16313eha abstractC16313eha = null;
                Json jsonJson$default = JsonKt.Json$default(null, new Function1() { // from class: o.exF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC17135exA.KWHzl((JsonBuilder) obj);
                    }
                }, 1, null);
                JsonElement toJsonElement = jsonJson$default.parseToJsonElement(strEZpvd);
                jsonJson$default.getSerializersModule();
                java.lang.String strEncodeToString = jsonJson$default.encodeToString(JsonElement.Companion.serializer(), toJsonElement);
                AbstractC16313eha abstractC16313eha2 = activityC17135exA.EZpvd;
                if (abstractC16313eha2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16313eha = abstractC16313eha2;
                }
                abstractC16313eha.EZpvd.setText(strEncodeToString);
            }
        }
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setPrettyPrint(true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ActivityC17135exA activityC17135exA) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17135exA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault() {
        this.djBIcL = new AbstractC33586mzJ.StateListAnimator(this).EZpvd(new C57633ymB(null, 1.0f, 0, false, 12, null)).KWHzl(EZpvd(), yDY.copydefault(0)).KWHzl(new ActionBar()).copydefault(true).copydefault(ContextCompat.getDrawable(this, C52761wXj.TaskDescription.updateVisuals)).copydefault();
    }

    /* JADX INFO: renamed from: o.exA$ActionBar */
    public static final class ActionBar implements AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator {
        public ActionBar() {
        }

        @Override // o.AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator
        public void OLrzqt(int i, java.util.ArrayList<C33583mzG> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            C33583mzG c33583mzG = arrayList.get(0);
            Intrinsics.copydefault(c33583mzG, "");
            C33600mzX c33600mzX = (C33600mzX) c33583mzG;
            ActivityC17135exA activityC17135exA = ActivityC17135exA.this;
            java.lang.Object objKWHzl = c33600mzX.KWHzl();
            Intrinsics.copydefault(objKWHzl, "");
            activityC17135exA.AEQbTJ = ((java.lang.Long) objKWHzl).longValue();
            AbstractC16313eha abstractC16313eha = ActivityC17135exA.this.EZpvd;
            AbstractC33586mzJ abstractC33586mzJ = null;
            if (abstractC16313eha == null) {
                Intrinsics.gEmmrt("");
                abstractC16313eha = null;
            }
            abstractC16313eha.valueOf.setText(c33600mzX.copydefault());
            AbstractC33586mzJ abstractC33586mzJ2 = ActivityC17135exA.this.djBIcL;
            if (abstractC33586mzJ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC33586mzJ = abstractC33586mzJ2;
            }
            abstractC33586mzJ.EZpvd();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
