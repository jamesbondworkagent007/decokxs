package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.okinc.core.util.SPUtils;
import com.okinc.market.common.debugger.OKMarketDebugActivity$Companion$startActivity$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ActivityC38392pXb extends pWW {
    public static final Activity Companion = new Activity(null);
    public static final InterfaceC56387yDm<java.util.List<pWV>> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pXe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC38392pXb.valueOf();
        }
    });

    /* JADX INFO: renamed from: o.pXb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pXb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.util.List<pWV> AEQbTJ() {
            return (java.util.List) ActivityC38392pXb.EZpvd.getValue();
        }

        public final void KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C38397pXg.registerDebugItem$default("🔞 Mocking Server", 0, 0, new OKMarketDebugActivity$Companion$startActivity$1(C38413pXw.Companion), 4, null);
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC38392pXb.class));
        }
    }

    public static final java.util.List valueOf() {
        return new java.util.ArrayList();
    }

    @Override // o.pWW, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        KWHzl(linearLayout);
        setContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x009f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatButton, o.wYp] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final void KWHzl(android.widget.LinearLayout linearLayout) {
        ?? linearLayout2;
        for (final pWV pwv : CollectionsKt___CollectionsKt.EZpvd(Companion.AEQbTJ(), new StateListAnimator())) {
            if (pwv.KWHzl() == 0) {
                linearLayout2 = new C52794wYp(this, null, 0, 6, null);
                linearLayout2.setAllCaps(false);
                linearLayout2.setText(pwv.AEQbTJ());
                linearLayout2.setOKDSSize(44);
                linearLayout2.setOKDSType(258);
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.pXa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC38392pXb.OLrzqt(pwv, this, view);
                    }
                });
            } else {
                linearLayout2 = new android.widget.LinearLayout(this);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                android.widget.TextView textView = new android.widget.TextView(this);
                textView.setText(pwv.AEQbTJ());
                textView.setTextSize(16.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                textView.setLayoutParams(layoutParams);
                linearLayout2.addView(textView);
                C55239xgG c55239xgG = new C55239xgG(this, null, 0, 6, null);
                c55239xgG.setChecked(SPUtils.getBoolean(pwv.AEQbTJ(), true));
                c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.pXd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        ActivityC38392pXb.EZpvd(pwv, this, compoundButton, z);
                    }
                });
                linearLayout2.addView(c55239xgG, -2, -2);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMarginStart((int) C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
            layoutParams2.setMarginEnd((int) C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
            layoutParams2.topMargin = (int) C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
            layoutParams2.bottomMargin = (int) C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
            Unit unit = Unit.INSTANCE;
            linearLayout.addView(linearLayout2, layoutParams2);
        }
    }

    public static final void OLrzqt(pWV pwv, ActivityC38392pXb activityC38392pXb, android.view.View view) {
        pwv.copydefault().invoke(activityC38392pXb);
    }

    /* JADX INFO: renamed from: o.pXb$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((pWV) t).OLrzqt()), java.lang.Integer.valueOf(((pWV) t2).OLrzqt()));
        }
    }

    public static final void EZpvd(pWV pwv, ActivityC38392pXb activityC38392pXb, android.widget.CompoundButton compoundButton, boolean z) {
        SPUtils.put(pwv.AEQbTJ(), java.lang.Boolean.valueOf(z), "market_debug_pre_file");
        pwv.copydefault().invoke(activityC38392pXb);
    }

    @Override // o.pWW, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.pWW, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.pWW, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.pWW, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
