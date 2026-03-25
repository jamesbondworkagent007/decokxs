package com.okinc.debugbox.track.report;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.okinc.debugbox.track.report.ReportMonitorManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC32051mNr;
import o.ActivityC32076mOp;
import o.C31976mKx;
import o.C52761wXj;
import o.C54819xWm;
import o.C55249xgQ;
import o.C56392yDr;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.mKC;
import o.mKI;
import o.mND;
import o.mNF;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ReportMonitorManager {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final List<Object> AEQbTJ;
    public final Context KWHzl;
    public final List<Object> OLrzqt;
    public Dialog copydefault;
    public final mKI djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    public final void copydefault() {
    }

    public ReportMonitorManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.AEQbTJ = new ArrayList();
        this.OLrzqt = new ArrayList();
        this.djBIcL = new mKI(new ReportMonitorManager$reportDataAdapter$1(this), C31976mKx.Application.zLjUOn, C31976mKx.Activity.RKcVTr);
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ReportMonitorManager.EZpvd(this.OLrzqt);
            }
        });
        EZpvd();
        gEmmrt();
        AEQbTJ();
        if (!AhwBna()) {
            valueOf();
        }
        copydefault();
    }

    public final AbstractC32051mNr KWHzl() {
        return (AbstractC32051mNr) this.gEmmrt.getValue();
    }

    public static final AbstractC32051mNr EZpvd(ReportMonitorManager reportMonitorManager) {
        AbstractC32051mNr abstractC32051mNrKWHzl = AbstractC32051mNr.KWHzl(LayoutInflater.from(new ContextThemeWrapper(reportMonitorManager.KWHzl, C52761wXj.LoaderManager.fvQaOB)), null, false);
        Intrinsics.checkNotNullExpressionValue(abstractC32051mNrKWHzl, "");
        return abstractC32051mNrKWHzl;
    }

    public final boolean AhwBna() {
        return (mND.OLrzqt("ReportDebugWindow_TAG_HANDLE") == null || mND.OLrzqt("ReportDebugWindow_TAG_WINDOW") == null) ? false : true;
    }

    public final void EZpvd() {
        KWHzl().KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.mOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ReportMonitorManager.AYXKKw(this.copydefault, view);
            }
        });
        KWHzl().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ReportMonitorManager.gEmmrt(this.KWHzl, view);
            }
        });
        KWHzl().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.mOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ReportMonitorManager.AhwBna(this.AEQbTJ, view);
            }
        });
        KWHzl().EZpvd.setAdapter(this.djBIcL);
        KWHzl().EZpvd.setItemAnimator(null);
    }

    public static final void AYXKKw(ReportMonitorManager reportMonitorManager, View view) {
        reportMonitorManager.OLrzqt();
    }

    public static final void gEmmrt(ReportMonitorManager reportMonitorManager, View view) {
        reportMonitorManager.AYXKKw();
    }

    public static final void AhwBna(ReportMonitorManager reportMonitorManager, View view) {
        reportMonitorManager.AEQbTJ.clear();
        reportMonitorManager.djBIcL();
    }

    public final void OLrzqt(int i) {
        String json = new Gson().toJson(this.OLrzqt.get(i));
        ActivityC32076mOp.ActionBar actionBar = ActivityC32076mOp.Companion;
        Context applicationContext = this.KWHzl.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        Intrinsics.copydefault((Object) json);
        this.KWHzl.startActivity(actionBar.EZpvd(applicationContext, json));
    }

    public final void AEQbTJ() {
        Iterator it = yDY.gEmmrt(KWHzl().AhwBna, KWHzl().valueOf).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new View.OnClickListener() { // from class: o.mOr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ReportMonitorManager.djBIcL(this.KWHzl, view);
                }
            });
        }
        KWHzl().djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.mOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ReportMonitorManager.fetchVPNInfo(this.KWHzl, view);
            }
        });
    }

    public static final void djBIcL(final ReportMonitorManager reportMonitorManager, View view) {
        showFilterEditDialog$default(reportMonitorManager, null, new Function1() { // from class: o.mOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReportMonitorManager.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(ReportMonitorManager reportMonitorManager, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        reportMonitorManager.KWHzl().valueOf.setText(str);
        reportMonitorManager.djBIcL();
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(ReportMonitorManager reportMonitorManager, View view) {
        reportMonitorManager.KWHzl().valueOf.setText("");
        reportMonitorManager.djBIcL();
    }

    public final void djBIcL() {
        CharSequence text = KWHzl().valueOf.getText();
        List<Object> list = this.AEQbTJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String string = obj.toString();
            Intrinsics.copydefault(text);
            if (StringsKt__StringsKt.contains$default((CharSequence) string, text, false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        this.OLrzqt.clear();
        this.OLrzqt.addAll(arrayList);
        KWHzl().EZpvd.post(new Runnable() { // from class: o.mOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ReportMonitorManager.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(ReportMonitorManager reportMonitorManager) {
        RecyclerView.LayoutManager layoutManager;
        mKI mki = reportMonitorManager.djBIcL;
        List<Object> list = reportMonitorManager.OLrzqt;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (Object obj : list) {
            arrayList.add(new mKC(obj.toString(), obj.hashCode()));
        }
        mki.copydefault(arrayList);
        pUU.EZpvd("ReportDebugWindow", "reload report data list: " + reportMonitorManager.OLrzqt.size());
        int size = reportMonitorManager.OLrzqt.size() + (-1);
        if (size < 0 || (layoutManager = reportMonitorManager.KWHzl().EZpvd.getLayoutManager()) == null) {
            return;
        }
        layoutManager.startSmoothScroll(new TaskDescription(size, reportMonitorManager.KWHzl));
    }

    public static final class TaskDescription extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return 50;
        }

        public TaskDescription(int i, Context context) {
            super(context);
            setTargetPosition(i);
        }
    }

    public final void gEmmrt() {
        for (ReportType reportType : ReportType.values()) {
            C55249xgQ c55249xgQ = KWHzl().AYXKKw;
            TabLayout.Tab tabNewTab = KWHzl().AYXKKw.newTab();
            tabNewTab.setId(reportType.getId());
            tabNewTab.setText(reportType.getDisplayName());
            c55249xgQ.addTab(tabNewTab);
        }
        KWHzl().AYXKKw.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            ReportMonitorManager.this.djBIcL();
        }
    }

    public final void valueOf() {
        Context applicationContext = this.KWHzl.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = this.KWHzl;
        }
        ImageView imageView = new ImageView(applicationContext);
        imageView.setImageResource(C31976mKx.ActionBar.gEmmrt);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ReportMonitorManager.AkhnZx(this.AEQbTJ, view);
            }
        });
        mND.KWHzl(applicationContext).EZpvd(imageView).AEQbTJ("ReportDebugWindow_TAG_HANDLE").copydefault(0).AEQbTJ(1, 0.7f).KWHzl(3).KWHzl(true).KWHzl();
        mND.KWHzl(applicationContext).EZpvd(KWHzl().getRoot()).AEQbTJ("ReportDebugWindow_TAG_WINDOW").copydefault(0, 1.0f).OLrzqt(0, 0.0f).AEQbTJ(1, 0.2f).KWHzl(3).KWHzl(true).KWHzl();
    }

    public static final void AkhnZx(ReportMonitorManager reportMonitorManager, View view) {
        reportMonitorManager.fetchVPNInfo();
    }

    public final void fetchVPNInfo() {
        if (!AhwBna()) {
            valueOf();
        }
        copydefault();
        mNF mnfOLrzqt = mND.OLrzqt("ReportDebugWindow_TAG_HANDLE");
        if (mnfOLrzqt != null) {
            mnfOLrzqt.djBIcL();
        }
        mNF mnfOLrzqt2 = mND.OLrzqt("ReportDebugWindow_TAG_WINDOW");
        if (mnfOLrzqt2 != null) {
            mnfOLrzqt2.isConnected();
        }
    }

    public final void AYXKKw() {
        mNF mnfOLrzqt = mND.OLrzqt("ReportDebugWindow_TAG_HANDLE");
        if (mnfOLrzqt != null) {
            mnfOLrzqt.isConnected();
        }
        mNF mnfOLrzqt2 = mND.OLrzqt("ReportDebugWindow_TAG_WINDOW");
        if (mnfOLrzqt2 != null) {
            mnfOLrzqt2.djBIcL();
        }
    }

    public final void OLrzqt() {
        mND.EZpvd("ReportDebugWindow_TAG_HANDLE");
        mND.EZpvd("ReportDebugWindow_TAG_WINDOW");
    }

    public static /* synthetic */ void showFilterEditDialog$default(ReportMonitorManager reportMonitorManager, CharSequence charSequence, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = reportMonitorManager.KWHzl().valueOf.getText();
        }
        reportMonitorManager.OLrzqt(charSequence, (Function1<? super String, Unit>) function1);
    }

    public final void OLrzqt(CharSequence charSequence, final Function1<? super String, Unit> function1) {
        android.app.Activity activityAEQbTJ;
        if (this.copydefault == null && (activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ()) != null) {
            View viewInflate = View.inflate(activityAEQbTJ, C31976mKx.Application.ejfBZ, null);
            final AppCompatDialog appCompatDialog = new AppCompatDialog(activityAEQbTJ);
            appCompatDialog.setContentView(viewInflate);
            appCompatDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.mOx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    ReportMonitorManager.EZpvd(this.copydefault, dialogInterface);
                }
            });
            appCompatDialog.setCanceledOnTouchOutside(false);
            Window window = appCompatDialog.getWindow();
            if (window != null) {
                window.setGravity(80);
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -2);
            }
            final EditText editText = (EditText) appCompatDialog.findViewById(C31976mKx.Activity.DcqEDu);
            if (editText != null) {
                editText.setText(charSequence);
            }
            View viewFindViewById = appCompatDialog.findViewById(C31976mKx.Activity.RKDWNf);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o.mOy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ReportMonitorManager.copydefault(editText, function1, appCompatDialog, view);
                    }
                });
            }
            View viewFindViewById2 = appCompatDialog.findViewById(C31976mKx.Activity.AxsJAYaxsJAY);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: o.mOw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ReportMonitorManager.AEQbTJ(appCompatDialog, view);
                    }
                });
            }
            appCompatDialog.show();
            this.copydefault = appCompatDialog;
        }
    }

    public static final void EZpvd(ReportMonitorManager reportMonitorManager, DialogInterface dialogInterface) {
        reportMonitorManager.copydefault = null;
    }

    public static final void copydefault(EditText editText, Function1 function1, AppCompatDialog appCompatDialog, View view) {
        String string;
        Editable editableText;
        String string2;
        if (editText == null || (editableText = editText.getEditableText()) == null || (string2 = editableText.toString()) == null || (string = StringsKt__StringsKt.hDKMBd((CharSequence) string2).toString()) == null) {
            string = "";
        }
        function1.invoke(string);
        appCompatDialog.dismiss();
    }

    public static final void AEQbTJ(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.dismiss();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ReportType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ReportType[] $VALUES;
        private final String displayName;
        private final int id;
        public static final ReportType All = new ReportType("All", 0, "All", 1);
        public static final ReportType Common = new ReportType("Common", 1, "Common", 2);
        public static final ReportType APM = new ReportType("APM", 2, "APM", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ReportType[] $values() {
            return new ReportType[]{All, Common, APM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ReportType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getId() {
            return this.id;
        }

        private ReportType(String str, int i, String str2, int i2) {
            this.displayName = str2;
            this.id = i2;
        }

        static {
            ReportType[] reportTypeArr$values = $values();
            $VALUES = reportTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(reportTypeArr$values);
        }

        public static ReportType valueOf(String str) {
            return (ReportType) Enum.valueOf(ReportType.class, str);
        }

        public static ReportType[] values() {
            return (ReportType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.debugbox.track.report.ReportMonitorManager.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
