package o;

import com.lzf.easyfloat.enums.ShowPattern;
import com.lzf.easyfloat.enums.SidePattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8114awd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8048avQ {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.avQ$ActionBar */
    public static final class ActionBar {
        private ActionBar() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:27) call: o.avQ.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TaskDescription copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            if (context instanceof android.app.Activity) {
                return new TaskDescription(context);
            }
            android.app.Activity activityCopydefault = C8127awq.copydefault.copydefault();
            if (activityCopydefault != null) {
                context = activityCopydefault;
            }
            return new TaskDescription(context);
        }

        public static /* synthetic */ Unit dismiss$default(ActionBar actionBar, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return actionBar.OLrzqt(str, z);
        }

        public final Unit OLrzqt(java.lang.String str, boolean z) {
            return C8056avY.OLrzqt.copydefault(str, z);
        }

        public static /* synthetic */ Unit hide$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.KWHzl(str);
        }

        public final Unit KWHzl(java.lang.String str) {
            return C8056avY.OLrzqt.AEQbTJ(false, str, false);
        }

        public static /* synthetic */ Unit show$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.gEmmrt(str);
        }

        public final Unit gEmmrt(java.lang.String str) {
            return C8056avY.OLrzqt.AEQbTJ(true, str, true);
        }

        public static /* synthetic */ Unit dragEnable$default(ActionBar actionBar, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return actionBar.EZpvd(z, str);
        }

        public final Unit EZpvd(boolean z, java.lang.String str) {
            C8055avX c8055avXEZpvd = EZpvd(str);
            if (c8055avXEZpvd == null) {
                return null;
            }
            c8055avXEZpvd.AEQbTJ(z);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ boolean isShow$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.AhwBna(str);
        }

        public final boolean AhwBna(java.lang.String str) {
            C8055avX c8055avXEZpvd = EZpvd(str);
            if (c8055avXEZpvd != null) {
                return c8055avXEZpvd.wlaJM();
            }
            return false;
        }

        public static /* synthetic */ android.view.View getFloatView$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.OLrzqt(str);
        }

        public final android.view.View OLrzqt(java.lang.String str) {
            C8055avX c8055avXEZpvd = EZpvd(str);
            if (c8055avXEZpvd != null) {
                return c8055avXEZpvd.fJNWhG();
            }
            return null;
        }

        public static /* synthetic */ Unit updateFloat$default(ActionBar actionBar, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = null;
            }
            if ((i3 & 2) != 0) {
                i = -1;
            }
            if ((i3 & 4) != 0) {
                i2 = -1;
            }
            return actionBar.copydefault(str, i, i2);
        }

        public final Unit copydefault(java.lang.String str, int i, int i2) {
            C8053avV c8053avVKWHzl = C8056avY.OLrzqt.KWHzl(str);
            if (c8053avVKWHzl == null) {
                return null;
            }
            c8053avVKWHzl.OLrzqt(i, i2);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ java.lang.Boolean filterActivity$default(ActionBar actionBar, android.app.Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return actionBar.OLrzqt(activity, str);
        }

        public final java.lang.Boolean OLrzqt(@NotNull android.app.Activity activity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(activity, "");
            java.util.Set<java.lang.String> setAEQbTJ = AEQbTJ(str);
            if (setAEQbTJ == null) {
                return null;
            }
            android.content.ComponentName componentName = activity.getComponentName();
            Intrinsics.checkNotNullExpressionValue(componentName, "");
            java.lang.String className = componentName.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            return java.lang.Boolean.valueOf(setAEQbTJ.add(className));
        }

        public static /* synthetic */ java.lang.Boolean filterActivities$default(ActionBar actionBar, java.lang.String str, java.lang.Class[] clsArr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.EZpvd(str, (java.lang.Class<?>[]) clsArr);
        }

        public final java.lang.Boolean EZpvd(java.lang.String str, @NotNull java.lang.Class<?>... clsArr) {
            Intrinsics.checkNotNullParameter(clsArr, "");
            java.util.Set<java.lang.String> setAEQbTJ = AEQbTJ(str);
            if (setAEQbTJ == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(clsArr.length);
            for (java.lang.Class<?> cls : clsArr) {
                arrayList.add(cls.getName());
            }
            return java.lang.Boolean.valueOf(setAEQbTJ.addAll(arrayList));
        }

        public static /* synthetic */ java.lang.Boolean removeFilter$default(ActionBar actionBar, android.app.Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return actionBar.KWHzl(activity, str);
        }

        public final java.lang.Boolean KWHzl(@NotNull android.app.Activity activity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(activity, "");
            java.util.Set<java.lang.String> setAEQbTJ = AEQbTJ(str);
            if (setAEQbTJ == null) {
                return null;
            }
            android.content.ComponentName componentName = activity.getComponentName();
            Intrinsics.checkNotNullExpressionValue(componentName, "");
            return java.lang.Boolean.valueOf(setAEQbTJ.remove(componentName.getClassName()));
        }

        public static /* synthetic */ java.lang.Boolean removeFilters$default(ActionBar actionBar, java.lang.String str, java.lang.Class[] clsArr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.KWHzl(str, (java.lang.Class<?>[]) clsArr);
        }

        public final java.lang.Boolean KWHzl(java.lang.String str, @NotNull java.lang.Class<?>... clsArr) {
            Intrinsics.checkNotNullParameter(clsArr, "");
            java.util.Set<java.lang.String> setAEQbTJ = AEQbTJ(str);
            if (setAEQbTJ == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(clsArr.length);
            for (java.lang.Class<?> cls : clsArr) {
                arrayList.add(cls.getName());
            }
            return java.lang.Boolean.valueOf(setAEQbTJ.removeAll(arrayList));
        }

        public static /* synthetic */ Unit clearFilters$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.copydefault(str);
        }

        public final Unit copydefault(java.lang.String str) {
            java.util.Set<java.lang.String> setAEQbTJ = AEQbTJ(str);
            if (setAEQbTJ == null) {
                return null;
            }
            setAEQbTJ.clear();
            return Unit.INSTANCE;
        }

        public final C8055avX EZpvd(java.lang.String str) {
            C8053avV c8053avVKWHzl = C8056avY.OLrzqt.KWHzl(str);
            if (c8053avVKWHzl != null) {
                return c8053avVKWHzl.EZpvd();
            }
            return null;
        }

        public final java.util.Set<java.lang.String> AEQbTJ(java.lang.String str) {
            C8055avX c8055avXEZpvd = EZpvd(str);
            if (c8055avXEZpvd != null) {
                return c8055avXEZpvd.gEmmrt();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o.avQ$TaskDescription */
    public static final class TaskDescription implements InterfaceC8117awg {
        public final C8055avX KWHzl;
        public final android.content.Context copydefault;

        public TaskDescription(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = context;
            this.KWHzl = new C8055avX(null, null, null, false, false, false, false, false, false, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 536870911, null);
        }

        public final TaskDescription OLrzqt(@NotNull SidePattern sidePattern) {
            Intrinsics.checkNotNullParameter(sidePattern, "");
            this.KWHzl.KWHzl(sidePattern);
            return this;
        }

        public final TaskDescription KWHzl(@NotNull ShowPattern showPattern) {
            Intrinsics.checkNotNullParameter(showPattern, "");
            this.KWHzl.OLrzqt(showPattern);
            return this;
        }

        public static /* synthetic */ TaskDescription setLayout$default(TaskDescription taskDescription, int i, InterfaceC8118awh interfaceC8118awh, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                interfaceC8118awh = null;
            }
            return taskDescription.copydefault(i, interfaceC8118awh);
        }

        public final TaskDescription copydefault(int i, InterfaceC8118awh interfaceC8118awh) {
            this.KWHzl.copydefault(java.lang.Integer.valueOf(i));
            this.KWHzl.AEQbTJ(interfaceC8118awh);
            return this;
        }

        public static /* synthetic */ TaskDescription setLayout$default(TaskDescription taskDescription, android.view.View view, InterfaceC8118awh interfaceC8118awh, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                interfaceC8118awh = null;
            }
            return taskDescription.EZpvd(view, interfaceC8118awh);
        }

        public final TaskDescription EZpvd(@NotNull android.view.View view, InterfaceC8118awh interfaceC8118awh) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.AEQbTJ(view);
            this.KWHzl.AEQbTJ(interfaceC8118awh);
            return this;
        }

        public static /* synthetic */ TaskDescription setGravity$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return taskDescription.copydefault(i, i2, i3);
        }

        public final TaskDescription copydefault(int i, int i2, int i3) {
            this.KWHzl.AEQbTJ(i);
            this.KWHzl.copydefault(new kotlin.Pair<>(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
            return this;
        }

        public static /* synthetic */ TaskDescription setBorder$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = -C8124awn.EZpvd.AhwBna(taskDescription.copydefault);
            }
            if ((i5 & 4) != 0) {
                i3 = C8124awn.EZpvd.copydefault(taskDescription.copydefault);
            }
            if ((i5 & 8) != 0) {
                i4 = C8124awn.EZpvd.OLrzqt(taskDescription.copydefault);
            }
            return taskDescription.AEQbTJ(i, i2, i3, i4);
        }

        public final TaskDescription AEQbTJ(int i, int i2, int i3, int i4) {
            this.KWHzl.KWHzl(i);
            this.KWHzl.OLrzqt(i2);
            this.KWHzl.copydefault(i3);
            this.KWHzl.EZpvd(i4);
            return this;
        }

        public final TaskDescription copydefault(java.lang.String str) {
            this.KWHzl.KWHzl(str);
            return this;
        }

        public final TaskDescription OLrzqt(boolean z) {
            this.KWHzl.AEQbTJ(z);
            return this;
        }

        public final TaskDescription AEQbTJ(@NotNull Function1<? super C8114awd.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C8055avX c8055avX = this.KWHzl;
            C8114awd c8114awd = new C8114awd();
            c8114awd.AEQbTJ(function1);
            Unit unit = Unit.INSTANCE;
            c8055avX.AEQbTJ(c8114awd);
            return this;
        }

        public final TaskDescription OLrzqt(InterfaceC8115awe interfaceC8115awe) {
            this.KWHzl.KWHzl(interfaceC8115awe);
            return this;
        }

        public static /* synthetic */ TaskDescription setMatchParent$default(TaskDescription taskDescription, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return taskDescription.EZpvd(z, z2);
        }

        public final TaskDescription EZpvd(boolean z, boolean z2) {
            this.KWHzl.djBIcL(z);
            this.KWHzl.OLrzqt(z2);
            return this;
        }

        public final void EZpvd() throws java.lang.Exception {
            if (this.KWHzl.ejfBZ() == null && this.KWHzl.fJNWhG() == null) {
                OLrzqt("No layout exception. You need to set up the layout file.");
                return;
            }
            if (this.KWHzl.uzCIH() == ShowPattern.CURRENT_ACTIVITY) {
                KWHzl();
            } else if (C8116awf.copydefault(this.copydefault)) {
                KWHzl();
            } else {
                AEQbTJ();
            }
        }

        public final void KWHzl() {
            C8056avY.OLrzqt.OLrzqt(this.copydefault, this.KWHzl);
        }

        public final void AEQbTJ() throws java.lang.Exception {
            android.content.Context context = this.copydefault;
            if (context instanceof android.app.Activity) {
                C8116awf.EZpvd((android.app.Activity) context, this);
            } else {
                OLrzqt("Context exception. Request Permission need to pass in a activity context.");
            }
        }

        @Override // o.InterfaceC8117awg
        public void KWHzl(boolean z) throws java.lang.Exception {
            if (z) {
                KWHzl();
            } else {
                OLrzqt("No permission exception. You need to turn on overlay permissions.");
            }
        }

        public final void OLrzqt(java.lang.String str) throws java.lang.Exception {
            C8114awd.Application applicationKWHzl;
            yHO<java.lang.Boolean, java.lang.String, android.view.View, Unit> yhoOLrzqt;
            InterfaceC8111awa interfaceC8111awaOLrzqt = this.KWHzl.OLrzqt();
            if (interfaceC8111awaOLrzqt != null) {
                interfaceC8111awaOLrzqt.EZpvd(false, str, null);
            }
            C8114awd c8114awdAYXKKw = this.KWHzl.AYXKKw();
            if (c8114awdAYXKKw != null && (applicationKWHzl = c8114awdAYXKKw.KWHzl()) != null && (yhoOLrzqt = applicationKWHzl.OLrzqt()) != null) {
                yhoOLrzqt.invoke(java.lang.Boolean.FALSE, str, null);
            }
            C8130awt.OLrzqt.KWHzl(str);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "No layout exception. You need to set up the layout file.") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Uninitialized exception. You need to initialize in the application.") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Context exception. Activity float need to pass in a activity context.")) {
                throw new java.lang.Exception(str);
            }
        }
    }
}
