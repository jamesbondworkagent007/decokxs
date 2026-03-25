package com.okinc.business.defi.assets.detail.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseItem {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.detail.biz.BaseItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BaseItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BaseItem() {
    }

    public static final class Dialog extends BaseItem {
        public final String EZpvd;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StatusItem extends BaseItem {
        public final Status copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class Status {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status STATUS_WAITING = new Status("STATUS_WAITING", 0);
            public static final Status STATUS_PENDING = new Status("STATUS_PENDING", 1);
            public static final Status STATUS_EXCHANGE_REQUEST = new Status("STATUS_EXCHANGE_REQUEST", 2);
            public static final Status STATUS_SPEEDING_UP = new Status("STATUS_SPEEDING_UP", 3);
            public static final Status STATUS_CANCELING = new Status("STATUS_CANCELING", 4);
            public static final Status STATUS_FAILED = new Status("STATUS_FAILED", 5);
            public static final Status STATUS_COMPLETED = new Status("STATUS_COMPLETED", 6);
            public static final Status STATUS_CANCELED = new Status("STATUS_CANCELED", 7);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Status[] $values() {
                return new Status[]{STATUS_WAITING, STATUS_PENDING, STATUS_EXCHANGE_REQUEST, STATUS_SPEEDING_UP, STATUS_CANCELING, STATUS_FAILED, STATUS_COMPLETED, STATUS_CANCELED};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusItem(@NotNull Status status) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "");
            this.copydefault = status;
        }
    }

    public static final class Application extends BaseItem {
        public final boolean AEQbTJ;
        public final boolean AYXKKw;
        public final String AhwBna;
        public final String AkhnZx;
        public final String EZpvd;
        public final String KWHzl;
        public final CharSequence OLrzqt;
        public final String copydefault;
        public final int djBIcL;
        public final boolean gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.CharSequence)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r24v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
 A[MD:(java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, java.lang.String, boolean):void (m)] (LINE:924) call: com.okinc.business.defi.assets.detail.biz.BaseItem.Application.<init>(java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Application(String str, CharSequence charSequence, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i, String str6, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, charSequence, str2, str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? -1 : i, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? true : z3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull String str, @NotNull CharSequence charSequence, @NotNull String str2, @NotNull String str3, String str4, boolean z, boolean z2, String str5, int i, @NotNull String str6, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.valueOf = str;
            this.OLrzqt = charSequence;
            this.EZpvd = str2;
            this.copydefault = str3;
            this.AkhnZx = str4;
            this.AYXKKw = z;
            this.gEmmrt = z2;
            this.AhwBna = str5;
            this.djBIcL = i;
            this.KWHzl = str6;
            this.AEQbTJ = z3;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity extends BaseItem {
        public final String AEQbTJ;
        public final String AhwBna;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final int copydefault;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.AhwBna = str;
            this.AEQbTJ = str2;
            this.copydefault = i;
            this.KWHzl = str3;
            this.OLrzqt = str4;
            this.EZpvd = str5;
            this.valueOf = z;
        }
    }

    public static final class FragmentManager extends BaseItem {
        public final String AEQbTJ;
        public final String AhwBna;
        public final String EZpvd;
        public final boolean KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final NetworkFeeNoticeType gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkFeeNoticeType OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType:?: TERNARY null = ((wrap:int:0x002c: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: SGET  A[WRAPPED] (LINE:954) com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType.NOTICE_TYPE_NONE com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType) : (r20v0 com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType):void (m)] (LINE:946) call: com.okinc.business.defi.assets.detail.biz.BaseItem.FragmentManager.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType):void type: THIS */
        public /* synthetic */ FragmentManager(String str, String str2, String str3, String str4, String str5, String str6, boolean z, NetworkFeeNoticeType networkFeeNoticeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? NetworkFeeNoticeType.NOTICE_TYPE_NONE : networkFeeNoticeType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull String str, String str2, @NotNull String str3, String str4, String str5, String str6, boolean z, @NotNull NetworkFeeNoticeType networkFeeNoticeType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(networkFeeNoticeType, "");
            this.EZpvd = str;
            this.AhwBna = str2;
            this.copydefault = str3;
            this.OLrzqt = str4;
            this.AEQbTJ = str5;
            this.djBIcL = str6;
            this.KWHzl = z;
            this.gEmmrt = networkFeeNoticeType;
        }
    }

    public static final class TaskDescription extends BaseItem {
        public final int EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final CharSequence copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull String str, @NotNull CharSequence charSequence, @NotNull String str2, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = charSequence;
            this.KWHzl = str2;
            this.EZpvd = i;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator extends BaseItem {
        public final String EZpvd;
        public final boolean KWHzl;
        public final List<Application> OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Application> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull String str, @NotNull List<Application> list, boolean z, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.OLrzqt = list;
            this.KWHzl = z;
            this.EZpvd = str2;
        }
    }

    public static final class ActionBar extends BaseItem {
        public final String AEQbTJ;
        public final String KWHzl;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull String str, @NotNull String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.KWHzl = str3;
        }
    }
}
