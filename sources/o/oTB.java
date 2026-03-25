package o;

import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oTB {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC36227oTz copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oTz), (r2v0 java.lang.String), (r3v0 java.lang.String), (r4v0 java.lang.String) A[MD:(o.oTz, java.lang.String, java.lang.String, java.lang.String):void (m)] call: o.oTB.<init>(o.oTz, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ oTB(InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC36227oTz, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC36227oTz KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public oTB(InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.copydefault = interfaceC36227oTz;
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:o.oTz:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.oTz) : (r8v0 o.oTz))
  (r9v0 java.lang.String)
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(o.oTz, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:8) call: o.oTB.<init>(o.oTz, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ oTB(InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC36227oTz, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, null);
    }

    public static final class Activity extends oTB {
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final boolean djBIcL;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AYXKKw;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                z = activity.valueOf;
            }
            if ((i & 8) != 0) {
                z2 = activity.djBIcL;
            }
            return activity.KWHzl(str, str2, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, str2, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && this.valueOf == activity.valueOf && this.djBIcL == activity.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            java.lang.String str = this.EZpvd;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Title(title=" + this.AYXKKw + ", description=" + this.EZpvd + ", showDivider=" + this.valueOf + ", isVisible=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:15) call: o.oTB.Activity.<init>(java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
            super(null, str, null, str2, 5, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AYXKKw = str;
            this.EZpvd = str2;
            this.valueOf = z;
            this.djBIcL = z2;
        }
    }

    public static final class TaskDescription extends oTB {
        public boolean AYXKKw;
        public final boolean AhwBna;
        public final java.lang.String EZpvd;
        public boolean djBIcL;
        public final java.lang.String gEmmrt;
        public final InterfaceC36227oTz isConnected;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC36227oTz = taskDescription.isConnected;
            }
            if ((i & 2) != 0) {
                str = taskDescription.valueOf;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                str2 = taskDescription.gEmmrt;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = taskDescription.EZpvd;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                z = taskDescription.AYXKKw;
            }
            boolean z4 = z;
            if ((i & 32) != 0) {
                z2 = taskDescription.AhwBna;
            }
            boolean z5 = z2;
            if ((i & 64) != 0) {
                z3 = taskDescription.djBIcL;
            }
            return taskDescription.OLrzqt(interfaceC36227oTz, str4, str5, str6, z4, z5, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public InterfaceC36227oTz KWHzl() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(interfaceC36227oTz, str, str2, str3, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.isConnected, taskDescription.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) taskDescription.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskDescription.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.AYXKKw == taskDescription.AYXKKw && this.AhwBna == taskDescription.AhwBna && this.djBIcL == taskDescription.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.isConnected.hashCode();
            int iHashCode2 = this.valueOf.hashCode();
            int iHashCode3 = this.gEmmrt.hashCode();
            java.lang.String str = this.EZpvd;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Switch(type=" + this.isConnected + ", title=" + this.valueOf + ", subTitle=" + this.gEmmrt + ", description=" + this.EZpvd + ", isChecked=" + this.AYXKKw + ", isVisible=" + this.AhwBna + ", isShowRedPoint=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r10v0 o.oTz)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(o.oTz, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:22) call: o.oTB.TaskDescription.<init>(o.oTz, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC36227oTz, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
            super(interfaceC36227oTz, str, str2, str3, null);
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.isConnected = interfaceC36227oTz;
            this.valueOf = str;
            this.gEmmrt = str2;
            this.EZpvd = str3;
            this.AYXKKw = z;
            this.AhwBna = z2;
            this.djBIcL = z3;
        }
    }

    public static final class Application extends oTB {
        public final boolean AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.util.List<TradeMenuItemBean> djBIcL;
        public final InterfaceC36227oTz gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.oTB$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC36227oTz = application.gEmmrt;
            }
            if ((i & 2) != 0) {
                str = application.valueOf;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                str2 = application.AhwBna;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = application.EZpvd;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                z = application.AYXKKw;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                list = application.djBIcL;
            }
            return application.copydefault(interfaceC36227oTz, str4, str5, str6, z2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public InterfaceC36227oTz KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List<TradeMenuItemBean> list) {
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(interfaceC36227oTz, str, str2, str3, z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.gEmmrt, application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) application.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && this.AYXKKw == application.AYXKKw && Intrinsics.EZpvd(this.djBIcL, application.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TradeMenuItemBean> gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.gEmmrt.hashCode();
            int iHashCode2 = this.valueOf.hashCode();
            java.lang.String str = this.AhwBna;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            int iHashCode5 = java.lang.Boolean.hashCode(this.AYXKKw);
            java.util.List<TradeMenuItemBean> list = this.djBIcL;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Enter(type=" + this.gEmmrt + ", title=" + this.valueOf + ", description=" + this.AhwBna + ", content=" + this.EZpvd + ", isVisible=" + this.AYXKKw + ", selectList=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r10v0 o.oTz)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0017: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
 A[MD:(o.oTz, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.widget.data.TradeMenuItemBean>):void (m)] (LINE:32) call: o.oTB.Application.<init>(o.oTz, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
        public /* synthetic */ Application(InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC36227oTz, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List<TradeMenuItemBean> list) {
            super(interfaceC36227oTz, str, null, str2, 4, null);
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt = interfaceC36227oTz;
            this.valueOf = str;
            this.AhwBna = str2;
            this.EZpvd = str3;
            this.AYXKKw = z;
            this.djBIcL = list;
        }
    }

    public static final class ActionBar extends oTB {
        public final InterfaceC36227oTz AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.Integer EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC36227oTz = actionBar.AYXKKw;
            }
            if ((i & 2) != 0) {
                str = actionBar.AhwBna;
            }
            if ((i & 4) != 0) {
                num = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(interfaceC36227oTz, str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public InterfaceC36227oTz KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(interfaceC36227oTz, str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.AYXKKw, actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) actionBar.AhwBna) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            int iHashCode2 = this.AhwBna.hashCode();
            java.lang.Integer num = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EnterDrawable(type=" + this.AYXKKw + ", title=" + this.AhwBna + ", imageResource=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, java.lang.Integer num) {
            super(interfaceC36227oTz, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AYXKKw = interfaceC36227oTz;
            this.AhwBna = str;
            this.EZpvd = num;
        }
    }

    public static final class StateListAnimator extends oTB {
        public final java.util.List<java.lang.String> AYXKKw;
        public final java.util.List<android.graphics.drawable.Drawable> AhwBna;
        public final java.lang.Integer EZpvd;
        public final boolean djBIcL;
        public final InterfaceC36227oTz fetchVPNInfo;
        public int gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @NotNull java.util.List<? extends android.graphics.drawable.Drawable> list, @NotNull java.util.List<java.lang.String> list2, int i, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new StateListAnimator(interfaceC36227oTz, str, str2, num, list, list2, i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public InterfaceC36227oTz KWHzl() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(int i) {
            this.gEmmrt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oTB
        public java.lang.String copydefault() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.fetchVPNInfo, stateListAnimator.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) stateListAnimator.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.AhwBna, stateListAnimator.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, stateListAnimator.AYXKKw) && this.gEmmrt == stateListAnimator.gEmmrt && this.djBIcL == stateListAnimator.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<android.graphics.drawable.Drawable> gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.fetchVPNInfo.hashCode();
            int iHashCode2 = this.isConnected.hashCode();
            java.lang.String str = this.valueOf;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.EZpvd;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Segment(type=" + this.fetchVPNInfo + ", title=" + this.isConnected + ", description=" + this.valueOf + ", color=" + this.EZpvd + ", drawableList=" + this.AhwBna + ", textList=" + this.AYXKKw + ", selectedIndex=" + this.gEmmrt + ", isVisible=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r13v0 o.oTz)
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:53)) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001e: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:54)) : (r18v0 java.util.List))
  (r19v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
 A[MD:(o.oTz, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<? extends android.graphics.drawable.Drawable>, java.util.List<java.lang.String>, int, boolean):void (m)] (LINE:47) call: o.oTB.StateListAnimator.<init>(o.oTz, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.util.List, int, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(InterfaceC36227oTz interfaceC36227oTz, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.util.List list, java.util.List list2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC36227oTz, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? yDY.AhwBna() : list, (i2 & 32) != 0 ? yDY.AhwBna() : list2, i, (i2 & 128) != 0 ? true : z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.List<? extends android.graphics.drawable.Drawable> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull InterfaceC36227oTz interfaceC36227oTz, @NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @NotNull java.util.List<? extends android.graphics.drawable.Drawable> list, @NotNull java.util.List<java.lang.String> list2, int i, boolean z) {
            super(interfaceC36227oTz, str, null, str2, 4, null);
            Intrinsics.checkNotNullParameter(interfaceC36227oTz, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.fetchVPNInfo = interfaceC36227oTz;
            this.isConnected = str;
            this.valueOf = str2;
            this.EZpvd = num;
            this.AhwBna = list;
            this.AYXKKw = list2;
            this.gEmmrt = i;
            this.djBIcL = z;
        }
    }
}
