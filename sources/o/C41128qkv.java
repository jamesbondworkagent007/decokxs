package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC41028qjA;
import o.C41093qkM;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41128qkv extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C42697rbM OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41128qkv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41128qkv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.qkv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41128qkv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41128qkv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42697rbM c42697rbMOLrzqt = C42697rbM.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42697rbMOLrzqt, "");
        this.OLrzqt = c42697rbMOLrzqt;
    }

    /* JADX INFO: renamed from: o.qkv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qkv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void KWHzl(C41093qkM c41093qkM) {
        AEQbTJ(c41093qkM);
        OLrzqt(c41093qkM);
    }

    public final void AEQbTJ(C41093qkM c41093qkM) {
        C41093qkM.ActionBar actionBar;
        C41093qkM.ActionBar actionBar2;
        C41093qkM.ActionBar actionBar3;
        LinkedHashMap<java.lang.String, java.util.List<C41093qkM.ActionBar>> linkedHashMapCopydefault = c41093qkM != null ? c41093qkM.copydefault() : null;
        java.util.List<C41093qkM.ActionBar> list = linkedHashMapCopydefault != null ? linkedHashMapCopydefault.get("COLUMN_1") : null;
        int length = this.OLrzqt.OLrzqt.getReferencedIds().length;
        if (list != null) {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C41093qkM.ActionBar actionBar4 = (C41093qkM.ActionBar) obj;
                if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(length))) {
                    actionBar4.KWHzl(true);
                }
                i++;
            }
        }
        calcCategoriesHeight$default(this, list, false, 2, null);
        for (int i2 = 0; i2 < length; i2++) {
            C41129qkw c41129qkwKWHzl = KWHzl(this.OLrzqt.OLrzqt.getReferencedIds()[i2]);
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2), list != null ? java.lang.Integer.valueOf(list.size()) : null) && list != null && (actionBar3 = list.get(i2)) != null && c41129qkwKWHzl != null) {
                c41129qkwKWHzl.OLrzqt(actionBar3);
            }
        }
        java.util.List<C41093qkM.ActionBar> list2 = linkedHashMapCopydefault != null ? linkedHashMapCopydefault.get("COLUMN_2") : null;
        int length2 = this.OLrzqt.EZpvd.getReferencedIds().length;
        if (list2 != null) {
            int i3 = 0;
            for (java.lang.Object obj2 : list2) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                C41093qkM.ActionBar actionBar5 = (C41093qkM.ActionBar) obj2;
                if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(length2))) {
                    actionBar5.KWHzl(true);
                }
                i3++;
            }
        }
        calcCategoriesHeight$default(this, list2, false, 2, null);
        for (int i4 = 0; i4 < length2; i4++) {
            C41129qkw c41129qkwKWHzl2 = KWHzl(this.OLrzqt.EZpvd.getReferencedIds()[i4]);
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i4), list2 != null ? java.lang.Integer.valueOf(list2.size()) : null) && list2 != null && (actionBar2 = list2.get(i4)) != null && c41129qkwKWHzl2 != null) {
                c41129qkwKWHzl2.OLrzqt(actionBar2);
            }
        }
        java.util.List<C41093qkM.ActionBar> list3 = linkedHashMapCopydefault != null ? linkedHashMapCopydefault.get("COLUMN_3") : null;
        int length3 = this.OLrzqt.AYXKKw.getReferencedIds().length;
        if (list3 != null) {
            int i5 = 0;
            for (java.lang.Object obj3 : list3) {
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                C41093qkM.ActionBar actionBar6 = (C41093qkM.ActionBar) obj3;
                if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(length3))) {
                    actionBar6.KWHzl(true);
                }
                i5++;
            }
        }
        KWHzl(list3, true);
        for (int i6 = 0; i6 < length3; i6++) {
            C41129qkw c41129qkwKWHzl3 = KWHzl(this.OLrzqt.AYXKKw.getReferencedIds()[i6]);
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i6), list3 != null ? java.lang.Integer.valueOf(list3.size()) : null) && list3 != null && (actionBar = list3.get(i6)) != null && c41129qkwKWHzl3 != null) {
                c41129qkwKWHzl3.OLrzqt(actionBar);
            }
        }
    }

    public final C41129qkw KWHzl(int i) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof C41129qkw) {
            return (C41129qkw) viewFindViewById;
        }
        return null;
    }

    public static /* synthetic */ void calcCategoriesHeight$default(C41128qkv c41128qkv, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c41128qkv.KWHzl(list, z);
    }

    public final void KWHzl(java.util.List<C41093qkM.ActionBar> list, boolean z) {
        int iDp2px$default;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z) {
            iDp2px$default = C55298xhM.dp2px$default(C33129mqd.djBIcL(C33129mqd.subS$default(220, C33129mqd.mulS$default(java.lang.Integer.valueOf(list.size() - 1), 4, null, null, null, 14, null), null, null, null, 14, null)), null, 1, null);
        } else {
            iDp2px$default = C55298xhM.dp2px$default(C33129mqd.djBIcL(C33129mqd.subS$default(C33129mqd.subS$default(220, 40, null, null, null, 14, null), C33129mqd.mulS$default(java.lang.Integer.valueOf(list.size()), 4, null, null, null, 14, null), null, null, null, 14, null)), null, 1, null);
        }
        KWHzl(list, list.size() - 1, iDp2px$default);
    }

    public final void KWHzl(java.util.List<C41093qkM.ActionBar> list, int i, int i2) {
        int i3 = i;
        if (list == null || list.isEmpty() || i3 > list.size() - 1) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C33129mqd.OLrzqt((java.lang.Object) ((C41093qkM.ActionBar) obj).AYXKKw(), (java.lang.Object) 0)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == list.size()) {
            while (-1 < i3) {
                list.get(i3).OLrzqt(i2 / list.size());
                EZpvd(list.get(i3), list.get(i3).OLrzqt());
                i3--;
            }
            return;
        }
        float fDjBIcL = 0.0f;
        for (int i4 = i3; -1 < i4; i4--) {
            fDjBIcL += C33129mqd.djBIcL(C33129mqd.EZpvd(list.get(i4).AYXKKw()).abs());
        }
        for (int i5 = i3; -1 < i5; i5--) {
            int iAhwBna = C33129mqd.AhwBna(C33129mqd.mulS$default(C33129mqd.divS$default(java.lang.Float.valueOf(C33129mqd.djBIcL(C33129mqd.EZpvd(list.get(i5).AYXKKw()).abs())), java.lang.Float.valueOf(fDjBIcL), null, null, null, 14, null), java.lang.Integer.valueOf(i2), null, null, null, 14, null));
            if (iAhwBna <= C55298xhM.dp2px$default(C33129mqd.djBIcL(58), null, 1, null)) {
                list.get(i5).OLrzqt(C55298xhM.dp2px$default(C33129mqd.djBIcL(58), null, 1, null));
                EZpvd(list.get(i5), list.get(i5).OLrzqt());
                KWHzl(list, i3 - 1, i2 - list.get(i5).OLrzqt());
                return;
            }
            list.get(i5).OLrzqt(iAhwBna);
            EZpvd(list.get(i5), list.get(i5).OLrzqt());
        }
    }

    public final void EZpvd(C41093qkM.ActionBar actionBar, int i) {
        if (i <= C55298xhM.dp2px$default(C33129mqd.djBIcL(80), null, 1, null)) {
            actionBar.EZpvd(0);
            actionBar.copydefault(false);
        } else {
            actionBar.EZpvd(1);
        }
    }

    public final void OLrzqt(C41093qkM c41093qkM) {
        java.lang.String strAYXKKw;
        android.widget.TextView textView = this.OLrzqt.AhwBna;
        if (C33129mqd.AEQbTJ(c41093qkM != null ? java.lang.Integer.valueOf(c41093qkM.KWHzl()) : null, 5)) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.fARcdN);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.KWHzl);
        }
        textView.setText(strAYXKKw);
        Intrinsics.copydefault(textView);
        C41431qqg.setCornerRadius$default(textView, 0.0f, 0.0f, 0.0f, 8.0f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), 0.0f, 32, null);
        textView.setOnClickListener(new ActionBar(textView, 1000L, textView, this));
    }

    /* JADX INFO: renamed from: o.qkv$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C41128qkv EZpvd;
        public final /* synthetic */ android.widget.TextView KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.widget.TextView textView, C41128qkv c41128qkv) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = textView;
            this.EZpvd = c41128qkv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC41028qjA.Application application = ActivityC41028qjA.Companion;
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                application.EZpvd(context);
                this.EZpvd.copydefault();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        C32866mlf.onEvent$default("Markets_Overview_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.qku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41128qkv.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "categories", false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_type", "category_others", false, 4, null);
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.ITEM_NAME, "others", false, 4, null);
        return Unit.INSTANCE;
    }
}
