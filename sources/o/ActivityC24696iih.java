package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexlogic.bean.LiquidityHeaderBean;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;

/* JADX INFO: renamed from: o.iih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC24696iih extends AbstractActivityC33041mov {
    public C23488hzF AEQbTJ;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iik
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC24696iih.AhwBna(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null);
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iij
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC24696iih.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iip
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC24696iih.OLrzqt(this.OLrzqt));
        }
    });

    /* JADX INFO: renamed from: o.iih$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public final C24628ihS AEQbTJ() {
        return (C24628ihS) this.copydefault.getValue();
    }

    public static final C24628ihS AhwBna(ActivityC24696iih activityC24696iih) {
        return (C24628ihS) new ViewModelProvider(activityC24696iih).get(C24628ihS.class);
    }

    private final java.lang.String copydefault() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String copydefault(ActivityC24696iih activityC24696iih) {
        java.lang.String stringExtra;
        android.content.Intent intent = activityC24696iih.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("chain_id")) == null) ? "" : stringExtra;
    }

    private final boolean gEmmrt() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(ActivityC24696iih activityC24696iih) {
        android.content.Intent intent = activityC24696iih.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("extra_universal_1", true);
        }
        return true;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23488hzF c23488hzFCopydefault = C23488hzF.copydefault(getLayoutInflater());
        this.AEQbTJ = c23488hzFCopydefault;
        C23488hzF c23488hzF = null;
        if (c23488hzFCopydefault == null) {
            Intrinsics.gEmmrt("");
            c23488hzFCopydefault = null;
        }
        setContentView(c23488hzFCopydefault.getRoot());
        C23488hzF c23488hzF2 = this.AEQbTJ;
        if (c23488hzF2 == null) {
            Intrinsics.gEmmrt("");
            c23488hzF2 = null;
        }
        c23488hzF2.DbNXlk.getLayoutParams().height = C33570myu.gEmmrt(this);
        C23488hzF c23488hzF3 = this.AEQbTJ;
        if (c23488hzF3 == null) {
            Intrinsics.gEmmrt("");
            c23488hzF3 = null;
        }
        android.widget.ImageView imageView = c23488hzF3.EZpvd;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        C23488hzF c23488hzF4 = this.AEQbTJ;
        if (c23488hzF4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23488hzF = c23488hzF4;
        }
        final OKAnchorSelection oKAnchorSelection = c23488hzF.AEQbTJ;
        C55173xeu c55173xeuCopydefault = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault != null) {
            java.lang.String string = getString(C23274hvD.Fragment.gdmIOq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuCopydefault.setSubTitle((java.lang.CharSequence) string);
        }
        oKAnchorSelection.setDividerLineVisibility(false);
        oKAnchorSelection.djBIcL().KWHzl().setHint(getString(C23274hvD.Fragment.DTeKQX));
        oKAnchorSelection.djBIcL().KWHzl().setImeOptions(6);
        oKAnchorSelection.djBIcL().KWHzl().setInputType(32);
        oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.iir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.AEQbTJ(this.OLrzqt, oKAnchorSelection, (java.lang.CharSequence) obj);
            }
        });
        try {
            C22380heK c22380heK = C22380heK.OLrzqt;
            java.lang.String strCopydefault = copydefault();
            if (strCopydefault == null) {
                strCopydefault = "default_trade";
            }
            InterfaceC22646hjL interfaceC22646hjLGEmmrt = c22380heK.copydefault(strCopydefault).EZpvd(gEmmrt()).gEmmrt();
            if (interfaceC22646hjLGEmmrt.EZpvd()) {
                AEQbTJ().EZpvd().postValue(C56390yDp.OLrzqt(2, java.lang.Boolean.TRUE));
            } else if (interfaceC22646hjLGEmmrt.KWHzl().values().isEmpty()) {
                AEQbTJ().EZpvd().postValue(C56390yDp.OLrzqt(4, java.lang.Boolean.TRUE));
            } else {
                AEQbTJ().copydefault((java.util.List) CollectionsKt___CollectionsKt.dNCPSb(interfaceC22646hjLGEmmrt.KWHzl().values()));
            }
        } catch (java.lang.Exception e) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.String.valueOf(e.getMessage()), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
        valueOf();
    }

    public static final Unit AEQbTJ(ActivityC24696iih activityC24696iih, OKAnchorSelection oKAnchorSelection, java.lang.CharSequence charSequence) {
        activityC24696iih.AEQbTJ().copydefault().setValue(java.lang.String.valueOf(charSequence));
        if (charSequence == null || charSequence.length() == 0) {
            oKAnchorSelection.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        android.graphics.drawable.Drawable drawableOLrzqt;
        android.graphics.drawable.Drawable drawableOLrzqt2;
        android.graphics.drawable.Drawable drawableOLrzqt3;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.gqESXP);
        C23488hzF c23488hzF = null;
        android.graphics.drawable.Drawable drawableEZpvd = (drawable == null || (drawableOLrzqt3 = C33057mpK.OLrzqt(drawable, this, C52761wXj.Activity.fdOvFl)) == null) ? null : C33057mpK.EZpvd(drawableOLrzqt3, C33129mqd.AhwBna(java.lang.Float.valueOf(getResources().getDimension(C52761wXj.StateListAnimator.QKudOq))));
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.QqiRNA);
        android.graphics.drawable.Drawable drawableEZpvd2 = (drawable2 == null || (drawableOLrzqt2 = C33057mpK.OLrzqt(drawable2, this, C52761wXj.Activity.GiPPlLgiPPlL)) == null) ? null : C33057mpK.EZpvd(drawableOLrzqt2, C33129mqd.AhwBna(java.lang.Float.valueOf(getResources().getDimension(C52761wXj.StateListAnimator.QKudOq))));
        android.graphics.drawable.Drawable drawable3 = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.QqiRNA);
        android.graphics.drawable.Drawable drawableEZpvd3 = (drawable3 == null || (drawableOLrzqt = C33057mpK.OLrzqt(drawable3, this, C52761wXj.Activity.UlJrfe)) == null) ? null : C33057mpK.EZpvd(drawableOLrzqt, C33129mqd.AhwBna(java.lang.Float.valueOf(getResources().getDimension(C52761wXj.StateListAnimator.QKudOq))));
        if (AEQbTJ().valueOf()) {
            if (drawableEZpvd != null) {
                C23488hzF c23488hzF2 = this.AEQbTJ;
                if (c23488hzF2 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF2 = null;
                }
                c23488hzF2.djBIcL.setBackgroundDrawable(drawableEZpvd);
            }
        } else if (AEQbTJ().djBIcL()) {
            if (drawableEZpvd3 != null) {
                C23488hzF c23488hzF3 = this.AEQbTJ;
                if (c23488hzF3 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF3 = null;
                }
                c23488hzF3.djBIcL.setBackgroundDrawable(drawableEZpvd3);
            }
        } else if (drawableEZpvd2 != null) {
            C23488hzF c23488hzF4 = this.AEQbTJ;
            if (c23488hzF4 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF4 = null;
            }
            c23488hzF4.djBIcL.setBackgroundDrawable(drawableEZpvd2);
        }
        if (AEQbTJ().AYXKKw()) {
            C23488hzF c23488hzF5 = this.AEQbTJ;
            if (c23488hzF5 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF5 = null;
            }
            c23488hzF5.AYXKKw.setText(getString(C23274hvD.Fragment.Th));
            C23488hzF c23488hzF6 = this.AEQbTJ;
            if (c23488hzF6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23488hzF = c23488hzF6;
            }
            c23488hzF.AYXKKw.setEnabled(false);
            return;
        }
        C23488hzF c23488hzF7 = this.AEQbTJ;
        if (c23488hzF7 == null) {
            Intrinsics.gEmmrt("");
            c23488hzF7 = null;
        }
        c23488hzF7.AYXKKw.setText(getString(C23274hvD.Fragment.fXYAwm));
        C23488hzF c23488hzF8 = this.AEQbTJ;
        if (c23488hzF8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23488hzF = c23488hzF8;
        }
        c23488hzF.AYXKKw.setEnabled(true);
    }

    private final void valueOf() {
        C23488hzF c23488hzF = this.AEQbTJ;
        C23488hzF c23488hzF2 = null;
        if (c23488hzF == null) {
            Intrinsics.gEmmrt("");
            c23488hzF = null;
        }
        c23488hzF.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.iil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC24696iih.KWHzl(this.KWHzl, view);
            }
        });
        C23488hzF c23488hzF3 = this.AEQbTJ;
        if (c23488hzF3 == null) {
            Intrinsics.gEmmrt("");
            c23488hzF3 = null;
        }
        c23488hzF3.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.iii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC24696iih.AhwBna(this.OLrzqt, view);
            }
        });
        C23488hzF c23488hzF4 = this.AEQbTJ;
        if (c23488hzF4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23488hzF2 = c23488hzF4;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c23488hzF2.AYXKKw, 0L, new Function1() { // from class: o.iin
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.valueOf(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
        AEQbTJ().AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.iio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AEQbTJ().copydefault().observe(this, new StateListAnimator(new Function1() { // from class: o.iiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }));
        AEQbTJ().gEmmrt().observe(this, new StateListAnimator(new Function1() { // from class: o.iis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        }));
        AEQbTJ().EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.iit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        AEQbTJ().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.iiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24696iih.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }));
    }

    public static final void KWHzl(ActivityC24696iih activityC24696iih, android.view.View view) {
        activityC24696iih.OLrzqt();
    }

    public static final void AhwBna(ActivityC24696iih activityC24696iih, android.view.View view) {
        activityC24696iih.OLrzqt();
    }

    public static final Unit valueOf(ActivityC24696iih activityC24696iih, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.ArrayList<LiquidityListItem> arrayListKWHzl = activityC24696iih.AEQbTJ().KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListKWHzl) {
            if (((LiquidityListItem) obj).isSelected()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LiquidityListItem) it.next()).getId());
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.lang.String strCopydefault = activityC24696iih.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "default_trade";
        }
        c22380heK.copydefault(strCopydefault).EZpvd(activityC24696iih.gEmmrt()).gEmmrt().EZpvd(activityC24696iih, arrayList2);
        activityC24696iih.finish();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC24696iih activityC24696iih, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC24696iih.showLoading();
        } else {
            activityC24696iih.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC24696iih activityC24696iih, java.lang.String str) {
        if (str != null && str.length() > 0) {
            activityC24696iih.AEQbTJ().gEmmrt().setValue(activityC24696iih.AEQbTJ().OLrzqt(java.lang.String.valueOf(str), activityC24696iih.AEQbTJ().KWHzl()));
        } else {
            activityC24696iih.AEQbTJ().gEmmrt().setValue(new java.util.ArrayList());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.iih$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC24696iih KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC24696iih activityC24696iih) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = activityC24696iih;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    public static final Unit AEQbTJ(ActivityC24696iih activityC24696iih, java.util.List list) {
        activityC24696iih.EZpvd();
        C23488hzF c23488hzF = activityC24696iih.AEQbTJ;
        if (c23488hzF == null) {
            Intrinsics.gEmmrt("");
            c23488hzF = null;
        }
        OKAnchorSelection oKAnchorSelection = c23488hzF.AEQbTJ;
        Intrinsics.copydefault(list);
        oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final ActivityC24696iih activityC24696iih, kotlin.Pair pair) {
        C23488hzF c23488hzF = null;
        if (((java.lang.Boolean) pair.getSecond()).booleanValue()) {
            C23488hzF c23488hzF2 = activityC24696iih.AEQbTJ;
            if (c23488hzF2 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF2 = null;
            }
            c23488hzF2.AhwBna.setVisibility(0);
            if (((java.lang.Number) pair.getFirst()).intValue() == 4) {
                C23488hzF c23488hzF3 = activityC24696iih.AEQbTJ;
                if (c23488hzF3 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF3 = null;
                }
                c23488hzF3.AhwBna.setTitle("");
                C23488hzF c23488hzF4 = activityC24696iih.AEQbTJ;
                if (c23488hzF4 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF4 = null;
                }
                c23488hzF4.AhwBna.setEmptyTypeImage(5);
                C23488hzF c23488hzF5 = activityC24696iih.AEQbTJ;
                if (c23488hzF5 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF5 = null;
                }
                C55173xeu c55173xeu = c23488hzF5.AhwBna;
                java.lang.String string = activityC24696iih.getString(C23274hvD.Fragment.aJFbMH);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setSubTitle((java.lang.CharSequence) string);
            } else {
                C23488hzF c23488hzF6 = activityC24696iih.AEQbTJ;
                if (c23488hzF6 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF6 = null;
                }
                C55173xeu c55173xeu2 = c23488hzF6.AhwBna;
                java.lang.String string2 = activityC24696iih.getString(C23274hvD.Fragment.ActivityResultKt);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu2.setTitle(string2);
                C23488hzF c23488hzF7 = activityC24696iih.AEQbTJ;
                if (c23488hzF7 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF7 = null;
                }
                C55173xeu c55173xeu3 = c23488hzF7.AhwBna;
                java.lang.String string3 = activityC24696iih.getString(C23274hvD.Fragment.UscePu);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c55173xeu3.setSubTitle((java.lang.CharSequence) string3);
                C23488hzF c23488hzF8 = activityC24696iih.AEQbTJ;
                if (c23488hzF8 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF8 = null;
                }
                c23488hzF8.AhwBna.setEmptyTypeImage(2);
                C23488hzF c23488hzF9 = activityC24696iih.AEQbTJ;
                if (c23488hzF9 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF9 = null;
                }
                C55173xeu c55173xeu4 = c23488hzF9.AhwBna;
                java.lang.String string4 = activityC24696iih.getString(C23274hvD.Fragment.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                c55173xeu4.setRetry(string4);
                C23488hzF c23488hzF10 = activityC24696iih.AEQbTJ;
                if (c23488hzF10 == null) {
                    Intrinsics.gEmmrt("");
                    c23488hzF10 = null;
                }
                c23488hzF10.AhwBna.setRetryClickListener(new View.OnClickListener() { // from class: o.iiw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC24696iih.AYXKKw(this.copydefault, view);
                    }
                });
            }
            C23488hzF c23488hzF11 = activityC24696iih.AEQbTJ;
            if (c23488hzF11 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF11 = null;
            }
            c23488hzF11.KWHzl.setVisibility(8);
            C23488hzF c23488hzF12 = activityC24696iih.AEQbTJ;
            if (c23488hzF12 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23488hzF = c23488hzF12;
            }
            c23488hzF.AEQbTJ.djBIcL().setVisibility(8);
        } else {
            C23488hzF c23488hzF13 = activityC24696iih.AEQbTJ;
            if (c23488hzF13 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF13 = null;
            }
            c23488hzF13.AEQbTJ.djBIcL().setVisibility(0);
            C23488hzF c23488hzF14 = activityC24696iih.AEQbTJ;
            if (c23488hzF14 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF14 = null;
            }
            c23488hzF14.KWHzl.setVisibility(0);
            C23488hzF c23488hzF15 = activityC24696iih.AEQbTJ;
            if (c23488hzF15 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23488hzF = c23488hzF15;
            }
            c23488hzF.AhwBna.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(ActivityC24696iih activityC24696iih, android.view.View view) {
        C24628ihS c24628ihSAEQbTJ = activityC24696iih.AEQbTJ();
        java.lang.String strCopydefault = activityC24696iih.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        c24628ihSAEQbTJ.copydefault(strCopydefault, activityC24696iih.KWHzl(), activityC24696iih.gEmmrt());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final ActivityC24696iih activityC24696iih, java.util.List list) {
        final android.graphics.drawable.Drawable drawableEZpvd;
        final android.graphics.drawable.Drawable drawableEZpvd2 = null;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC24696iih, true, (java.lang.String) null, 2, (java.lang.Object) null);
        activityC24696iih.EZpvd();
        C23488hzF c23488hzF = activityC24696iih.AEQbTJ;
        if (c23488hzF == null) {
            Intrinsics.gEmmrt("");
            c23488hzF = null;
        }
        OKAnchorSelection oKAnchorSelection = c23488hzF.AEQbTJ;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(oKAnchorSelection.getContext(), C52761wXj.TaskDescription.gqESXP);
        if (drawable != null) {
            android.content.Context context = oKAnchorSelection.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.graphics.drawable.Drawable drawableOLrzqt = C33057mpK.OLrzqt(drawable, context, C52761wXj.Activity.OJuSTm);
            drawableEZpvd = drawableOLrzqt != null ? C33057mpK.EZpvd(drawableOLrzqt, C33129mqd.AhwBna(java.lang.Float.valueOf(oKAnchorSelection.getResources().getDimension(C52761wXj.StateListAnimator.QKudOq)))) : null;
        }
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(oKAnchorSelection.getContext(), C52761wXj.TaskDescription.QqiRNA);
        if (drawable2 != null) {
            android.content.Context context2 = oKAnchorSelection.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            android.graphics.drawable.Drawable drawableOLrzqt2 = C33057mpK.OLrzqt(drawable2, context2, C52761wXj.Activity.GiPPlLgiPPlL);
            if (drawableOLrzqt2 != null) {
                drawableEZpvd2 = C33057mpK.EZpvd(drawableOLrzqt2, C33129mqd.AhwBna(java.lang.Float.valueOf(oKAnchorSelection.getResources().getDimension(C52761wXj.StateListAnimator.QKudOq))));
            }
        }
        oKAnchorSelection.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            LiquidityHeaderBean liquidityHeaderBean = (LiquidityHeaderBean) it.next();
            arrayList.add(java.lang.String.valueOf(liquidityHeaderBean.getSuspensionTag()));
            oKAnchorSelection.OLrzqt(liquidityHeaderBean);
        }
        oKAnchorSelection.setIndexList(arrayList);
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.iim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC24696iih.OLrzqt(drawableEZpvd, drawableEZpvd2, activityC24696iih, (C55043xcW) obj, obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final android.graphics.drawable.Drawable drawable, final android.graphics.drawable.Drawable drawable2, final ActivityC24696iih activityC24696iih, final C55043xcW c55043xcW, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final LiquidityListItem liquidityListItem = (LiquidityListItem) obj;
        c55043xcW.EZpvd(C23274hvD.Application.sILrnl, liquidityListItem.getName());
        AppCompatImageView appCompatImageView = (AppCompatImageView) c55043xcW.EZpvd(C23274hvD.Application.UPzgla);
        if (appCompatImageView != null) {
            C57659ymb.EZpvd(appCompatImageView, liquidityListItem.getLogo(), C52761wXj.TaskDescription.dzCpvv);
        }
        c55043xcW.AEQbTJ(C23274hvD.Application.getRoot, liquidityListItem.isSelected() ? drawable : drawable2);
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.iiq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC24696iih.OLrzqt(liquidityListItem, activityC24696iih, c55043xcW, drawable, drawable2, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(LiquidityListItem liquidityListItem, ActivityC24696iih activityC24696iih, C55043xcW c55043xcW, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.view.View view) {
        liquidityListItem.setSelected(!liquidityListItem.isSelected());
        activityC24696iih.EZpvd();
        int i = C23274hvD.Application.getRoot;
        if (!liquidityListItem.isSelected()) {
            drawable = drawable2;
        }
        c55043xcW.AEQbTJ(i, drawable);
    }

    public final void OLrzqt() {
        if (AEQbTJ().djBIcL()) {
            return;
        }
        boolean zValueOf = AEQbTJ().valueOf();
        C23488hzF c23488hzF = null;
        if (zValueOf) {
            C23488hzF c23488hzF2 = this.AEQbTJ;
            if (c23488hzF2 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF2 = null;
            }
            c23488hzF2.AYXKKw.setText(getString(C23274hvD.Fragment.Th));
            C23488hzF c23488hzF3 = this.AEQbTJ;
            if (c23488hzF3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23488hzF = c23488hzF3;
            }
            c23488hzF.AYXKKw.setEnabled(false);
        } else {
            C23488hzF c23488hzF4 = this.AEQbTJ;
            if (c23488hzF4 == null) {
                Intrinsics.gEmmrt("");
                c23488hzF4 = null;
            }
            c23488hzF4.AYXKKw.setText(getString(C23274hvD.Fragment.fXYAwm));
            C23488hzF c23488hzF5 = this.AEQbTJ;
            if (c23488hzF5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23488hzF = c23488hzF5;
            }
            c23488hzF.AYXKKw.setEnabled(true);
        }
        AEQbTJ().AEQbTJ(!zValueOf);
        EZpvd();
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
