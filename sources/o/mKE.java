package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import o.mKE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mKE extends mKV {
    public final java.util.ArrayList<Application<java.lang.String, java.lang.Boolean>> AEQbTJ = new java.util.ArrayList<>();
    public C55239xgG AYXKKw;
    public C55059xcm AhwBna;
    public C55059xcm EZpvd;
    public boolean KWHzl;
    public OKRegularCell OLrzqt;
    public ActionBar copydefault;
    public RecyclerView gEmmrt;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AmplitudeName.values().length];
            try {
                iArr[AmplitudeName.CEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AmplitudeName.WEB3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.KWHzl;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        this.OLrzqt = (OKRegularCell) findViewById(C31976mKx.Activity.AuCTelauCTel);
        this.AhwBna = (C55059xcm) findViewById(C31976mKx.Activity.QCjLjM);
        this.EZpvd = (C55059xcm) findViewById(C31976mKx.Activity.RdAHlO);
        this.AYXKKw = (C55239xgG) findViewById(C31976mKx.Activity.fdOvFl);
        this.KWHzl = C35202nqq.OLrzqt.copydefault();
        C55239xgG c55239xgG = this.AYXKKw;
        OKRegularCell oKRegularCell = null;
        if (c55239xgG == null) {
            Intrinsics.gEmmrt("");
            c55239xgG = null;
        }
        c55239xgG.setChecked(this.KWHzl);
        C55239xgG c55239xgG2 = this.AYXKKw;
        if (c55239xgG2 == null) {
            Intrinsics.gEmmrt("");
            c55239xgG2 = null;
        }
        c55239xgG2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                mKE.EZpvd(this.copydefault, compoundButton, z);
            }
        });
        C55059xcm c55059xcm = this.EZpvd;
        if (c55059xcm == null) {
            Intrinsics.gEmmrt("");
            c55059xcm = null;
        }
        c55059xcm.copydefault().setTextAppearance(C31976mKx.LoaderManager.AEQbTJ);
        OKRegularCell oKRegularCell2 = this.OLrzqt;
        if (oKRegularCell2 == null) {
            Intrinsics.gEmmrt("");
            oKRegularCell2 = null;
        }
        oKRegularCell2.EZpvd().setTextAppearance(C31976mKx.LoaderManager.OLrzqt);
        C55239xgG c55239xgG3 = this.AYXKKw;
        if (c55239xgG3 == null) {
            Intrinsics.gEmmrt("");
            c55239xgG3 = null;
        }
        c55239xgG3.setTextAppearance(C31976mKx.LoaderManager.OLrzqt);
        this.gEmmrt = (RecyclerView) findViewById(C31976mKx.Activity.ODXsMY);
        copydefault(this.KWHzl);
        OKRegularCell oKRegularCell3 = this.OLrzqt;
        if (oKRegularCell3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            oKRegularCell = oKRegularCell3;
        }
        oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.mKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKE.copydefault(this.EZpvd, view);
            }
        });
        copydefault();
    }

    public static final void EZpvd(mKE mke, android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            mke.KWHzl = z;
            C35202nqq.OLrzqt.KWHzl(z);
            mke.copydefault(z);
        }
    }

    public static final void copydefault(mKE mke, android.view.View view) {
        mke.startActivity(new android.content.Intent(mke, (java.lang.Class<?>) ActivityC32008mMb.class));
    }

    public final void copydefault() {
        java.lang.CharSequence charSequence;
        C55059xcm c55059xcm = this.AhwBna;
        if (c55059xcm == null) {
            Intrinsics.gEmmrt("");
            c55059xcm = null;
        }
        c55059xcm.copydefault().setTextAppearance(C31976mKx.LoaderManager.AEQbTJ);
        for (final AmplitudeName amplitudeName : AmplitudeName.values()) {
            android.view.LayoutInflater layoutInflater = getLayoutInflater();
            int i = C31976mKx.Application.getFieldNames;
            C55059xcm c55059xcm2 = this.AhwBna;
            if (c55059xcm2 == null) {
                Intrinsics.gEmmrt("");
                c55059xcm2 = null;
            }
            android.view.View viewInflate = layoutInflater.inflate(i, (android.view.ViewGroup) c55059xcm2, false);
            Intrinsics.copydefault(viewInflate, "");
            OKRegularCell oKRegularCell = (OKRegularCell) viewInflate;
            oKRegularCell.setTitle(EZpvd(amplitudeName));
            oKRegularCell.EZpvd().setTextAppearance(C31976mKx.LoaderManager.OLrzqt);
            oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.mKL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKE.copydefault(this.OLrzqt, amplitudeName, view);
                }
            });
            C55059xcm c55059xcm3 = this.AhwBna;
            if (c55059xcm3 == null) {
                Intrinsics.gEmmrt("");
                c55059xcm3 = null;
            }
            c55059xcm3.addView(oKRegularCell);
        }
        AmplitudeName[] amplitudeNameArrValues = AmplitudeName.values();
        int length = amplitudeNameArrValues.length;
        int i2 = 0;
        while (true) {
            java.lang.String str = "PDABTestSkylabWeb3";
            if (i2 < length) {
                final AmplitudeName amplitudeName2 = amplitudeNameArrValues[i2];
                android.view.LayoutInflater layoutInflater2 = getLayoutInflater();
                int i3 = C31976mKx.Application.getFieldNames;
                C55059xcm c55059xcm4 = this.AhwBna;
                if (c55059xcm4 == null) {
                    Intrinsics.gEmmrt("");
                    c55059xcm4 = null;
                }
                android.view.View viewInflate2 = layoutInflater2.inflate(i3, (android.view.ViewGroup) c55059xcm4, false);
                Intrinsics.copydefault(viewInflate2, "");
                OKRegularCell oKRegularCell2 = (OKRegularCell) viewInflate2;
                oKRegularCell2.setTitle(EZpvd(amplitudeName2) + " (V2)");
                oKRegularCell2.EZpvd().setTextAppearance(C31976mKx.LoaderManager.OLrzqt);
                int i4 = Activity.KWHzl[amplitudeName2.ordinal()];
                if (i4 == 1) {
                    str = "PDABTestSkylabCefi";
                } else if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                oKRegularCell2.setContentDescription(str);
                oKRegularCell2.setOnClickListener(new View.OnClickListener() { // from class: o.mKM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        mKE.KWHzl(this.KWHzl, amplitudeName2, view);
                    }
                });
                C55059xcm c55059xcm5 = this.AhwBna;
                if (c55059xcm5 == null) {
                    Intrinsics.gEmmrt("");
                    c55059xcm5 = null;
                }
                c55059xcm5.addView(oKRegularCell2);
                i2++;
            } else {
                for (final AmplitudeName amplitudeName3 : AmplitudeName.values()) {
                    android.view.LayoutInflater layoutInflater3 = getLayoutInflater();
                    int i5 = C31976mKx.Application.getFieldNames;
                    C55059xcm c55059xcm6 = this.AhwBna;
                    if (c55059xcm6 == null) {
                        Intrinsics.gEmmrt("");
                        c55059xcm6 = null;
                    }
                    android.view.View viewInflate3 = layoutInflater3.inflate(i5, (android.view.ViewGroup) c55059xcm6, false);
                    Intrinsics.copydefault(viewInflate3, "");
                    OKRegularCell oKRegularCell3 = (OKRegularCell) viewInflate3;
                    oKRegularCell3.setTitle(AEQbTJ(amplitudeName3) + " (V2)");
                    oKRegularCell3.EZpvd().setTextAppearance(C31976mKx.LoaderManager.OLrzqt);
                    int i6 = Activity.KWHzl[amplitudeName3.ordinal()];
                    if (i6 == 1) {
                        charSequence = "PDABTestSkylabCefi";
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        charSequence = "PDABTestSkylabWeb3";
                    }
                    oKRegularCell3.setContentDescription(charSequence);
                    oKRegularCell3.setOnClickListener(new View.OnClickListener() { // from class: o.mKJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            mKE.gEmmrt(this.AEQbTJ, amplitudeName3, view);
                        }
                    });
                    C55059xcm c55059xcm7 = this.AhwBna;
                    if (c55059xcm7 == null) {
                        Intrinsics.gEmmrt("");
                        c55059xcm7 = null;
                    }
                    c55059xcm7.addView(oKRegularCell3);
                }
                return;
            }
        }
    }

    public static final void copydefault(mKE mke, AmplitudeName amplitudeName, android.view.View view) {
        mke.startActivity(ActivityC32016mMj.Companion.copydefault(mke, amplitudeName));
    }

    public static final void KWHzl(mKE mke, AmplitudeName amplitudeName, android.view.View view) {
        mke.startActivity(ActivityC32022mMp.Companion.AEQbTJ(mke, amplitudeName));
    }

    public static final void gEmmrt(mKE mke, AmplitudeName amplitudeName, android.view.View view) {
        mke.startActivity(mKY.Companion.AEQbTJ(mke, amplitudeName));
    }

    public final java.lang.String EZpvd(AmplitudeName amplitudeName) {
        int i = Activity.KWHzl[amplitudeName.ordinal()];
        if (i == 1) {
            return "cefi amplitude experiment";
        }
        if (i == 2) {
            return "web3 amplitude experiment";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final java.lang.String AEQbTJ(AmplitudeName amplitudeName) {
        int i = Activity.KWHzl[amplitudeName.ordinal()];
        if (i == 1) {
            return "cefi data tester experiment";
        }
        if (i == 2) {
            return "web3 data tester experiment";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void copydefault(boolean z) {
        RecyclerView recyclerView = this.gEmmrt;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setVisibility(z ? 0 : 8);
    }

    @Override // o.mKV
    public void OLrzqt() {
        for (Map.Entry entry : C56423yEv.gEmmrt(C35202nqq.OLrzqt.OLrzqt()).entrySet()) {
            this.AEQbTJ.add(new Application<>(entry.getKey(), entry.getValue()));
        }
        RecyclerView recyclerView = this.gEmmrt;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.copydefault = new ActionBar(this, this);
        RecyclerView recyclerView3 = this.gEmmrt;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(this.copydefault);
        ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.OLrzqt(this.AEQbTJ);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class ActionBar extends AbstractC8041avJ<Application<java.lang.String, java.lang.Boolean>> {
        public final /* synthetic */ mKE values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull mKE mke, android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.values = mke;
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new StateListAnimator(this, viewGroup);
        }

        public final class StateListAnimator extends AbstractC8033avB<Application<java.lang.String, java.lang.Boolean>> {
            public C55239xgG AEQbTJ;
            public final /* synthetic */ ActionBar EZpvd;
            public android.widget.TextView KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull ActionBar actionBar, android.view.ViewGroup viewGroup) {
                super(viewGroup, C31976mKx.Application.iwGUEr);
                Intrinsics.checkNotNullParameter(viewGroup, "");
                this.EZpvd = actionBar;
                android.view.View viewAEQbTJ = AEQbTJ(C31976mKx.Activity.RKcVTr);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
                this.KWHzl = (android.widget.TextView) viewAEQbTJ;
                android.view.View viewAEQbTJ2 = AEQbTJ(C31976mKx.Activity.fvQaOB);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ2, "");
                this.AEQbTJ = (C55239xgG) viewAEQbTJ2;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
            @Override // o.AbstractC8033avB
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(final Application<java.lang.String, java.lang.Boolean> application) {
                super.OLrzqt(application);
                this.KWHzl.setText(application != null ? application.AEQbTJ() : null);
                this.AEQbTJ.setChecked(application != null ? application.copydefault().booleanValue() : false);
                C55239xgG c55239xgG = this.AEQbTJ;
                final mKE mke = this.EZpvd.values;
                c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mKN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        mKE.ActionBar.StateListAnimator.EZpvd(application, mke, compoundButton, z);
                    }
                });
            }

            public static final void EZpvd(Application application, mKE mke, android.widget.CompoundButton compoundButton, boolean z) {
                java.lang.String str;
                if (compoundButton.isPressed()) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (application != null ? (java.lang.String) application.AEQbTJ() : null))) {
                        C35202nqq c35202nqq = C35202nqq.OLrzqt;
                        if (application == null || (str = (java.lang.String) application.AEQbTJ()) == null) {
                            str = "";
                        }
                        c35202nqq.AEQbTJ(str, z);
                        if (application != null) {
                            application.copydefault(java.lang.Boolean.valueOf(z));
                        }
                        pUU.KWHzl(mke.getTAG(), "pandora gray item: " + (application != null ? (java.lang.String) application.AEQbTJ() : null) + ", isCheck: " + z);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class Application<A, B> {
        public A EZpvd;
        public B OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(B b) {
            this.OLrzqt = b;
        }

        public Application(A a2, B b) {
            this.EZpvd = a2;
            this.OLrzqt = b;
        }
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
