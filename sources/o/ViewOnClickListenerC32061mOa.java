package o;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.debugbox.track.model.EventData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31976mKx;
import o.mNV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnClickListenerC32061mOa extends ConstraintLayout implements mNU<EventData>, View.OnClickListener {
    public AppCompatDialog AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String EZpvd;
    public final ActionBar KWHzl;
    public final AbstractC32047mNn OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC32061mOa(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC32061mOa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.mOa.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ViewOnClickListenerC32061mOa(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC32061mOa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        TabLayout.TabView tabView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new ActionBar(context);
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.mOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC32061mOa.KWHzl();
            }
        });
        this.EZpvd = "";
        this.valueOf = "";
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC32061mOa.copydefault();
            }
        });
        AbstractC32047mNn abstractC32047mNnOLrzqt = AbstractC32047mNn.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC32047mNnOLrzqt, "");
        this.OLrzqt = abstractC32047mNnOLrzqt;
        TabLayout tabLayout = abstractC32047mNnOLrzqt.copydefault;
        for (TrackChannel trackChannel : djBIcL()) {
            tabLayout.addTab(tabLayout.newTab().setText(trackChannel.name()), trackChannel.ordinal() == 0);
            TabLayout.Tab tabAt = tabLayout.getTabAt(0);
            if (tabAt != null && (tabView = tabAt.view) != null) {
                tabView.setBackgroundResource(C31976mKx.ActionBar.AEQbTJ);
            }
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription());
        }
        abstractC32047mNnOLrzqt.EZpvd.setLayoutManager(new LinearLayoutManager(context));
        abstractC32047mNnOLrzqt.EZpvd.setAdapter(this.KWHzl);
        abstractC32047mNnOLrzqt.gEmmrt.setOnClickListener(this);
        abstractC32047mNnOLrzqt.OLrzqt.setOnClickListener(this);
        abstractC32047mNnOLrzqt.KWHzl.setOnClickListener(this);
        abstractC32047mNnOLrzqt.AYXKKw.setOnClickListener(this);
        abstractC32047mNnOLrzqt.djBIcL.setOnClickListener(this);
    }

    private final TrackChannel[] djBIcL() {
        return (TrackChannel[]) this.AhwBna.getValue();
    }

    public static final TrackChannel[] KWHzl() {
        return TrackChannel.values();
    }

    private final java.util.List<EventData> gEmmrt() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List copydefault() {
        return new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.mOa$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa = ViewOnClickListenerC32061mOa.this;
                tab.view.setBackgroundResource(C31976mKx.ActionBar.AEQbTJ);
                viewOnClickListenerC32061mOa.EZpvd = Intrinsics.EZpvd((java.lang.Object) tab.getText(), (java.lang.Object) "All") ? "" : java.lang.String.valueOf(tab.getText());
                viewOnClickListenerC32061mOa.AYXKKw();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TabLayout.TabView tabView;
            if (tab == null || (tabView = tab.view) == null) {
                return;
            }
            tabView.setBackground(null);
        }
    }

    /* JADX INFO: renamed from: o.mOa$ActionBar */
    public static final class ActionBar extends AbstractC8041avJ<EventData> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(android.view.ViewGroup viewGroup, int i) {
            return new Activity(viewGroup);
        }
    }

    /* JADX INFO: renamed from: o.mOa$Activity */
    public static final class Activity extends AbstractC8033avB<EventData> implements View.OnClickListener {
        public android.widget.TextView AEQbTJ;
        public android.widget.TextView EZpvd;
        public EventData KWHzl;
        public android.widget.TextView copydefault;

        public Activity(android.view.ViewGroup viewGroup) {
            super(viewGroup, C31976mKx.Application.hDKMBd);
            android.view.View viewAEQbTJ = AEQbTJ(C31976mKx.Activity.ejfBZ);
            Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
            this.EZpvd = (android.widget.TextView) viewAEQbTJ;
            android.view.View viewAEQbTJ2 = AEQbTJ(C31976mKx.Activity.QwvEab);
            Intrinsics.checkNotNullExpressionValue(viewAEQbTJ2, "");
            this.AEQbTJ = (android.widget.TextView) viewAEQbTJ2;
            android.view.View viewAEQbTJ3 = AEQbTJ(C31976mKx.Activity.QKVWgx);
            Intrinsics.checkNotNullExpressionValue(viewAEQbTJ3, "");
            this.copydefault = (android.widget.TextView) viewAEQbTJ3;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
        @Override // o.AbstractC8033avB
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(EventData eventData) {
            java.lang.String strEZpvd;
            super.OLrzqt(eventData);
            this.KWHzl = eventData;
            if (eventData != null) {
                android.widget.TextView textView = this.EZpvd;
                if (eventData.copydefault().length() == 0 || C59449zhJ.gEmmrt(eventData.copydefault(), eventData.EZpvd(), true)) {
                    strEZpvd = eventData.EZpvd();
                } else {
                    strEZpvd = eventData.EZpvd() + "-" + C59449zhJ.iwGUEr(eventData.copydefault());
                }
                textView.setText(strEZpvd);
                this.AEQbTJ.setText(C32073mOm.EZpvd(eventData.KWHzl()));
                int iKWHzl = eventData.KWHzl();
                this.AEQbTJ.setBackgroundResource(iKWHzl != 0 ? iKWHzl != 1 ? C31976mKx.ActionBar.AhwBna : C31976mKx.ActionBar.valueOf : C31976mKx.ActionBar.EZpvd);
                this.copydefault.setText(eventData.AEQbTJ());
            }
            this.itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            EventData eventData = this.KWHzl;
            if (eventData != null) {
                mNT.copydefault.fetchVPNInfo();
                mNV.TaskDescription taskDescription = mNV.Companion;
                android.content.Context contextKWHzl = KWHzl();
                Intrinsics.checkNotNullExpressionValue(contextKWHzl, "");
                taskDescription.KWHzl(contextKWHzl, eventData);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)V */
    @Override // o.mNU
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final EventData eventData) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(eventData, "");
            post(new java.lang.Runnable() { // from class: o.mOh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC32061mOa.AEQbTJ(this.AEQbTJ, eventData);
                }
            });
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa, EventData eventData) {
        viewOnClickListenerC32061mOa.gEmmrt().add(eventData);
        if (viewOnClickListenerC32061mOa.EZpvd.length() != 0) {
            if (!Intrinsics.EZpvd((java.lang.Object) eventData.EZpvd(), (java.lang.Object) viewOnClickListenerC32061mOa.EZpvd)) {
                return;
            }
            if (viewOnClickListenerC32061mOa.valueOf.length() != 0 && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) eventData.AEQbTJ(), (java.lang.CharSequence) viewOnClickListenerC32061mOa.valueOf, false, 2, (java.lang.Object) null)) {
                return;
            }
        }
        viewOnClickListenerC32061mOa.KWHzl.EZpvd(eventData);
    }

    public void EZpvd() {
        synchronized (this) {
            post(new java.lang.Runnable() { // from class: o.mOk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC32061mOa.AEQbTJ(this.copydefault);
                }
            });
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa) {
        viewOnClickListenerC32061mOa.gEmmrt().clear();
        viewOnClickListenerC32061mOa.KWHzl.OLrzqt();
    }

    public void OLrzqt(@NotNull final Function1<? super EventData, java.lang.Boolean> function1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(function1, "");
            post(new java.lang.Runnable() { // from class: o.mOj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC32061mOa.EZpvd(this.copydefault, function1);
                }
            });
        }
    }

    public static final void EZpvd(ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa, Function1 function1) {
        viewOnClickListenerC32061mOa.KWHzl.OLrzqt();
        ActionBar actionBar = viewOnClickListenerC32061mOa.KWHzl;
        java.util.List<EventData> listGEmmrt = viewOnClickListenerC32061mOa.gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listGEmmrt) {
            if (((java.lang.Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        actionBar.OLrzqt(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw() {
        OLrzqt(new Function1() { // from class: o.mOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ViewOnClickListenerC32061mOa.OLrzqt(this.copydefault, (EventData) obj));
            }
        });
    }

    public static final boolean OLrzqt(ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa, EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        boolean zEZpvd = C33129mqd.OLrzqt((java.lang.CharSequence) viewOnClickListenerC32061mOa.EZpvd) ? Intrinsics.EZpvd((java.lang.Object) eventData.EZpvd(), (java.lang.Object) viewOnClickListenerC32061mOa.EZpvd) : true;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) viewOnClickListenerC32061mOa.valueOf)) {
            return zEZpvd && StringsKt__StringsKt.contains$default((java.lang.CharSequence) eventData.AEQbTJ(), (java.lang.CharSequence) viewOnClickListenerC32061mOa.valueOf, false, 2, (java.lang.Object) null);
        }
        return zEZpvd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        AbstractC32047mNn abstractC32047mNn = this.OLrzqt;
        if (Intrinsics.EZpvd(view, abstractC32047mNn.OLrzqt)) {
            AhwBna();
            return;
        }
        if (Intrinsics.EZpvd(view, abstractC32047mNn.KWHzl)) {
            abstractC32047mNn.OLrzqt.setText("");
            this.valueOf = "";
            AYXKKw();
        } else if (Intrinsics.EZpvd(view, abstractC32047mNn.gEmmrt)) {
            mNT.copydefault.values();
        } else if (Intrinsics.EZpvd(view, abstractC32047mNn.djBIcL)) {
            EZpvd();
        } else if (Intrinsics.EZpvd(view, abstractC32047mNn.AYXKKw)) {
            mNT.copydefault.fetchVPNInfo();
        }
    }

    public final void AhwBna() {
        android.view.View viewInflate;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || this.AEQbTJ != null || (viewInflate = android.view.View.inflate(activityAEQbTJ, C31976mKx.Application.ejfBZ, null)) == null) {
            return;
        }
        final AppCompatDialog appCompatDialog = new AppCompatDialog(activityAEQbTJ);
        appCompatDialog.setContentView(viewInflate);
        appCompatDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.mOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ViewOnClickListenerC32061mOa.AEQbTJ(this.AEQbTJ, dialogInterface);
            }
        });
        appCompatDialog.setCanceledOnTouchOutside(false);
        android.view.Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        android.view.Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        android.view.Window window3 = appCompatDialog.getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -2);
        }
        final android.widget.EditText editText = (android.widget.EditText) viewInflate.findViewById(C31976mKx.Activity.DcqEDu);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C31976mKx.Activity.RKDWNf);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.mOc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC32061mOa.KWHzl(this.AEQbTJ, editText, appCompatDialog, view);
                }
            });
        }
        android.view.View viewFindViewById = viewInflate.findViewById(C31976mKx.Activity.AxsJAYaxsJAY);
        Intrinsics.copydefault(viewFindViewById, "");
        ((android.widget.ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: o.mOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC32061mOa.OLrzqt(appCompatDialog, view);
            }
        });
        appCompatDialog.show();
        this.AEQbTJ = appCompatDialog;
    }

    public static final void AEQbTJ(ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa, android.content.DialogInterface dialogInterface) {
        viewOnClickListenerC32061mOa.AEQbTJ = null;
    }

    public static final void KWHzl(ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa, android.widget.EditText editText, AppCompatDialog appCompatDialog, android.view.View view) {
        java.lang.String string;
        android.text.Editable editableText;
        if (editText == null || (editableText = editText.getEditableText()) == null || (string = editableText.toString()) == null) {
            string = "";
        }
        viewOnClickListenerC32061mOa.valueOf = string;
        viewOnClickListenerC32061mOa.OLrzqt.OLrzqt.setText(string);
        viewOnClickListenerC32061mOa.AYXKKw();
        appCompatDialog.dismiss();
    }

    public static final void OLrzqt(AppCompatDialog appCompatDialog, android.view.View view) {
        appCompatDialog.dismiss();
    }
}
