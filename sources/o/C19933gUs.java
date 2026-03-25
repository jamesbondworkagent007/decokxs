package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19933gUs extends LinearLayoutCompat {
    public final C23529hzu EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public Activity copydefault;
    public Function0<Unit> gEmmrt;
    public boolean valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gUs$Activity */
    /* JADX INFO: loaded from: classes5.dex */
    public interface Activity {
        void fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(Activity activity) {
        this.copydefault = activity;
    }

    /* JADX INFO: renamed from: o.gUs$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19933gUs(@NotNull android.content.Context context) {
        C55320xhi c55320xhiKWHzl;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        C23529hzu c23529hzuCopydefault = C23529hzu.copydefault(android.view.LayoutInflater.from(getContext()), this);
        this.valueOf = true;
        Intrinsics.checkNotNullExpressionValue(c23529hzuCopydefault, "");
        this.EZpvd = c23529hzuCopydefault;
        this.KWHzl = true;
        setOrientation(1);
        C55312xha c55312xhaValueOf = c23529hzuCopydefault.EZpvd.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.gHZMYf);
        }
        C55258xgZ c55258xgZ = c23529hzuCopydefault.EZpvd;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.djBIcL);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context3));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(OLrzqt(), drawable, null, null, null);
        c23529hzuCopydefault.KWHzl.setRemoveEnabled(false);
        android.widget.TextView textViewOLrzqt = OLrzqt();
        textViewOLrzqt.setOnClickListener(new StateListAnimator(textViewOLrzqt, 1000L, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19933gUs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        C23529hzu c23529hzuCopydefault = C23529hzu.copydefault(android.view.LayoutInflater.from(getContext()), this);
        this.valueOf = true;
        Intrinsics.checkNotNullExpressionValue(c23529hzuCopydefault, "");
        this.EZpvd = c23529hzuCopydefault;
        this.KWHzl = true;
        setOrientation(1);
        C55312xha c55312xhaValueOf = c23529hzuCopydefault.EZpvd.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.gHZMYf);
        }
        C55258xgZ c55258xgZ = c23529hzuCopydefault.EZpvd;
        c55258xgZ.setOnClickListener(new PendingIntent(c55258xgZ, 1000L));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.djBIcL);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context3));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(OLrzqt(), drawable, null, null, null);
        c23529hzuCopydefault.KWHzl.setRemoveEnabled(false);
        android.widget.TextView textViewOLrzqt = OLrzqt();
        textViewOLrzqt.setOnClickListener(new LoaderManager(textViewOLrzqt, 1000L, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19933gUs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        C23529hzu c23529hzuCopydefault = C23529hzu.copydefault(android.view.LayoutInflater.from(getContext()), this);
        this.valueOf = true;
        Intrinsics.checkNotNullExpressionValue(c23529hzuCopydefault, "");
        this.EZpvd = c23529hzuCopydefault;
        this.KWHzl = true;
        setOrientation(1);
        C55312xha c55312xhaValueOf = c23529hzuCopydefault.EZpvd.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.gHZMYf);
        }
        C55258xgZ c55258xgZ = c23529hzuCopydefault.EZpvd;
        c55258xgZ.setOnClickListener(new Fragment(c55258xgZ, 1000L));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.djBIcL);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context3));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(OLrzqt(), drawable, null, null, null);
        c23529hzuCopydefault.KWHzl.setRemoveEnabled(false);
        android.widget.TextView textViewOLrzqt = OLrzqt();
        textViewOLrzqt.setOnClickListener(new Dialog(textViewOLrzqt, 1000L, this));
    }

    private final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    private final void copydefault(boolean z) {
        this.KWHzl = z;
        int i = z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
        int i2 = z ? C23274hvD.ActionBar.fJNWhG : 0;
        android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), i);
        OLrzqt().setBackgroundResource(i2);
        OLrzqt().setTextColor(colorStateList);
        TextViewCompat.setCompoundDrawableTintList(OLrzqt(), colorStateList);
    }

    private final Sequence<C19931gUq> valueOf() {
        Sequence<C19931gUq> sequenceDbNXlk = C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), ActionBar.copydefault);
        Intrinsics.copydefault(sequenceDbNXlk, "");
        return sequenceDbNXlk;
    }

    public final Sequence<java.lang.String> KWHzl() {
        return C59467zhb.DbNXlk(C59467zhb.fJNWhG(valueOf(), new Function1() { // from class: o.gUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19933gUs.OLrzqt((C19931gUq) obj);
            }
        }), new Function1() { // from class: o.gUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C19933gUs.EZpvd((java.lang.String) obj));
            }
        });
    }

    public static final java.lang.String OLrzqt(C19931gUq c19931gUq) {
        android.text.Editable text;
        Intrinsics.checkNotNullParameter(c19931gUq, "");
        C55001xbh c55001xbhAkhnZx = c19931gUq.copydefault().AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public static final boolean EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str);
    }

    public final boolean copydefault() {
        C19931gUq next;
        java.util.Iterator<C19931gUq> it = valueOf().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!next.OLrzqt()) {
                break;
            }
        }
        return next == null;
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C19931gUq c19931gUq = new C19931gUq(context);
        c19931gUq.setRemoveEnabled(true);
        c19931gUq.setChainId(str);
        c19931gUq.setOnRemoveClickListener(this.gEmmrt);
        c19931gUq.copydefault().setText(str2);
        addView(c19931gUq, getChildCount() - 1);
    }

    public final void setBlocklist(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        if (size == 0) {
            this.EZpvd.KWHzl.copydefault().setText("");
            java.util.Iterator it = C59467zhb.copydefault(valueOf(), 1).iterator();
            while (it.hasNext()) {
                removeView((C19931gUq) it.next());
            }
            return;
        }
        int iUzCIH = C59467zhb.uzCIH(valueOf());
        int i = 0;
        if (iUzCIH < size) {
            for (int i2 = 0; i2 < size - iUzCIH; i2++) {
                OLrzqt(str, list.get(iUzCIH + i2));
            }
        } else {
            java.util.Iterator it2 = C59467zhb.copydefault(valueOf(), size).iterator();
            while (it2.hasNext()) {
                removeView((C19931gUq) it2.next());
            }
        }
        for (C19931gUq c19931gUq : valueOf()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            c19931gUq.copydefault().setText(list.get(i));
            i++;
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        java.util.Iterator<C19931gUq> it = valueOf().iterator();
        while (it.hasNext()) {
            it.next().setChainId(str);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (this.valueOf) {
            AEQbTJ();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (this.valueOf) {
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        copydefault(C59467zhb.uzCIH(valueOf()) < 20);
    }

    /* JADX INFO: renamed from: o.gUs$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C19933gUs OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C19933gUs c19933gUs) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c19933gUs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Activity activityEZpvd = this.OLrzqt.EZpvd();
                if (activityEZpvd != null) {
                    activityEZpvd.fetchVPNInfo();
                }
                if (this.OLrzqt.KWHzl) {
                    C19933gUs c19933gUs = this.OLrzqt;
                    c19933gUs.OLrzqt(c19933gUs.OLrzqt, null);
                } else {
                    C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C23274hvD.Fragment.sElUiK, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "20"))), 0, 1, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gUs$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j) {
            this.EZpvd = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55258xgZ c55258xgZ = (C55258xgZ) this.EZpvd;
                android.content.Context context = c55258xgZ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.fVjYLc), c55258xgZ.getContext().getString(C23274hvD.Fragment.FQMcgE)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUs$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C19933gUs AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C19933gUs c19933gUs) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c19933gUs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Activity activityEZpvd = this.AEQbTJ.EZpvd();
                if (activityEZpvd != null) {
                    activityEZpvd.fetchVPNInfo();
                }
                if (this.AEQbTJ.KWHzl) {
                    C19933gUs c19933gUs = this.AEQbTJ;
                    c19933gUs.OLrzqt(c19933gUs.OLrzqt, null);
                } else {
                    C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C23274hvD.Fragment.sElUiK, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "20"))), 0, 1, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gUs$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55258xgZ c55258xgZ = (C55258xgZ) this.AEQbTJ;
                android.content.Context context = c55258xgZ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.fVjYLc), c55258xgZ.getContext().getString(C23274hvD.Fragment.FQMcgE)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19933gUs KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19933gUs c19933gUs) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c19933gUs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Activity activityEZpvd = this.KWHzl.EZpvd();
                if (activityEZpvd != null) {
                    activityEZpvd.fetchVPNInfo();
                }
                if (this.KWHzl.KWHzl) {
                    C19933gUs c19933gUs = this.KWHzl;
                    c19933gUs.OLrzqt(c19933gUs.OLrzqt, null);
                } else {
                    C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C23274hvD.Fragment.sElUiK, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "20"))), 0, 1, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gUs$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j) {
            this.copydefault = view;
            this.EZpvd = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C55258xgZ c55258xgZ = (C55258xgZ) this.copydefault;
                android.content.Context context = c55258xgZ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.fVjYLc), c55258xgZ.getContext().getString(C23274hvD.Fragment.FQMcgE)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUs$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof C19931gUq);
        }
    }
}
