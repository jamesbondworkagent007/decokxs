package com.okinc.im.imui.group.announcement;

import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.im.imui.group.announcement.AnnouncementMenuBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33888nJo;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.nPW;
import o.wXQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AnnouncementMenuBottomSheet extends nPW {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C33888nJo AEQbTJ;
    public Function1<? super MenuAction, Unit> AhwBna;
    public final boolean valueOf;
    public InterfaceC56387yDm<Boolean> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nPR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AnnouncementMenuBottomSheet.valueOf(this.AEQbTJ);
        }
    });
    public InterfaceC56387yDm<Boolean> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nPT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AnnouncementMenuBottomSheet.copydefault(this.OLrzqt);
        }
    });
    public InterfaceC56387yDm<Boolean> KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nPS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AnnouncementMenuBottomSheet.AYXKKw(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super MenuAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.valueOf;
    }

    public static final Boolean valueOf(AnnouncementMenuBottomSheet announcementMenuBottomSheet) {
        Bundle arguments = announcementMenuBottomSheet.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("ALLOW_PIN", false));
        }
        return null;
    }

    public static final Boolean copydefault(AnnouncementMenuBottomSheet announcementMenuBottomSheet) {
        Bundle arguments = announcementMenuBottomSheet.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("ALLOW_EDIT", false));
        }
        return null;
    }

    public static final Boolean AYXKKw(AnnouncementMenuBottomSheet announcementMenuBottomSheet) {
        Bundle arguments = announcementMenuBottomSheet.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("ALLOW_REMOVE", false));
        }
        return null;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.announcement.AnnouncementMenuBottomSheet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AnnouncementMenuBottomSheet KWHzl(boolean z, boolean z2, boolean z3) {
            AnnouncementMenuBottomSheet announcementMenuBottomSheet = new AnnouncementMenuBottomSheet();
            announcementMenuBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ALLOW_PIN", Boolean.valueOf(z)), C56390yDp.OLrzqt("ALLOW_EDIT", Boolean.valueOf(z2)), C56390yDp.OLrzqt("ALLOW_REMOVE", Boolean.valueOf(z3))));
            return announcementMenuBottomSheet;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class MenuAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MenuAction[] $VALUES;
        public static final MenuAction PIN_TO_CHAT = new MenuAction("PIN_TO_CHAT", 0);
        public static final MenuAction EDIT_NOTICE = new MenuAction("EDIT_NOTICE", 1);
        public static final MenuAction REMOVE_NOTICE = new MenuAction("REMOVE_NOTICE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MenuAction[] $values() {
            return new MenuAction[]{PIN_TO_CHAT, EDIT_NOTICE, REMOVE_NOTICE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MenuAction> getEntries() {
            return $ENTRIES;
        }

        private MenuAction(String str, int i) {
        }

        static {
            MenuAction[] menuActionArr$values = $values();
            $VALUES = menuActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(menuActionArr$values);
        }

        public static MenuAction valueOf(String str) {
            return (MenuAction) Enum.valueOf(MenuAction.class, str);
        }

        public static MenuAction[] values() {
            return (MenuAction[]) $VALUES.clone();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = C33888nJo.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        C33888nJo c33888nJo = this.AEQbTJ;
        if (c33888nJo != null) {
            LinearLayoutCompat linearLayoutCompat = c33888nJo.OLrzqt;
            Intrinsics.copydefault(linearLayoutCompat);
            Boolean value = this.OLrzqt.getValue();
            Boolean bool = Boolean.TRUE;
            linearLayoutCompat.setVisibility(Intrinsics.EZpvd(value, bool) ? 0 : 8);
            linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, this));
            LinearLayoutCompat linearLayoutCompat2 = c33888nJo.AEQbTJ;
            Intrinsics.copydefault(linearLayoutCompat2);
            linearLayoutCompat2.setVisibility(Intrinsics.EZpvd(this.copydefault.getValue(), bool) ? 0 : 8);
            linearLayoutCompat2.setOnClickListener(new ActionBar(linearLayoutCompat2, 1000L, this));
            LinearLayoutCompat linearLayoutCompat3 = c33888nJo.EZpvd;
            Intrinsics.copydefault(linearLayoutCompat3);
            linearLayoutCompat3.setVisibility(Intrinsics.EZpvd(this.KWHzl.getValue(), bool) ? 0 : 8);
            linearLayoutCompat3.setOnClickListener(new TaskDescription(linearLayoutCompat3, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AnnouncementMenuBottomSheet EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, AnnouncementMenuBottomSheet announcementMenuBottomSheet) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = announcementMenuBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.AhwBna;
                if (function1 != null) {
                    function1.invoke(MenuAction.EDIT_NOTICE);
                }
                this.EZpvd.dismiss();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ AnnouncementMenuBottomSheet AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, AnnouncementMenuBottomSheet announcementMenuBottomSheet) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = announcementMenuBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.AEQbTJ.AhwBna;
                if (function1 != null) {
                    function1.invoke(MenuAction.PIN_TO_CHAT);
                }
                this.AEQbTJ.dismiss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ AnnouncementMenuBottomSheet copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, AnnouncementMenuBottomSheet announcementMenuBottomSheet) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = announcementMenuBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.copydefault.AhwBna;
                if (function1 != null) {
                    function1.invoke(MenuAction.REMOVE_NOTICE);
                }
                this.copydefault.dismiss();
            }
        }
    }
}
