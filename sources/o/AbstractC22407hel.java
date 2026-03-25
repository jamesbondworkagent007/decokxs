package o;

import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hel, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22407hel {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC22407hel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22407hel() {
    }

    /* JADX INFO: renamed from: o.hel$LoaderManager */
    public static final class LoaderManager extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = loaderManager.KWHzl;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = loaderManager.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = loaderManager.OLrzqt;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = loaderManager.EZpvd;
            }
            return loaderManager.OLrzqt(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new LoaderManager(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) loaderManager.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) loaderManager.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) loaderManager.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) loaderManager.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) loaderManager.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeProviderSelectionPageView(chainId=" + this.copydefault + ", pageName=" + this.KWHzl + ", businessType=" + this.AEQbTJ + ", orderType=" + this.OLrzqt + ", transactionType=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.copydefault = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
            this.OLrzqt = str4;
            this.EZpvd = str5;
        }
    }

    /* JADX INFO: renamed from: o.hel$FragmentManager */
    public static final class FragmentManager extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.Map<java.lang.String, java.lang.String> copydefault;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.hel$FragmentManager */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = fragmentManager.AEQbTJ;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = fragmentManager.KWHzl;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = fragmentManager.OLrzqt;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = fragmentManager.gEmmrt;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = fragmentManager.copydefault;
            }
            return fragmentManager.KWHzl(str, str6, str7, str8, str9, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new FragmentManager(str, str2, str3, str4, str5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) fragmentManager.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fragmentManager.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) fragmentManager.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fragmentManager.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) fragmentManager.gEmmrt) && Intrinsics.EZpvd(this.copydefault, fragmentManager.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = this.OLrzqt.hashCode();
            int iHashCode5 = this.gEmmrt.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeProviderSelectionPageAction(chainId=" + this.EZpvd + ", pageName=" + this.AEQbTJ + ", businessType=" + this.KWHzl + ", orderType=" + this.OLrzqt + ", transactionType=" + this.gEmmrt + ", params=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
            this.OLrzqt = str4;
            this.gEmmrt = str5;
            this.copydefault = map;
        }
    }

    /* JADX INFO: renamed from: o.hel$PendingIntent */
    public static final class PendingIntent extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.util.List<java.lang.String> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.hel$PendingIntent */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = pendingIntent.copydefault;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = pendingIntent.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = pendingIntent.AhwBna;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = pendingIntent.EZpvd;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = pendingIntent.AYXKKw;
            }
            java.util.Map map2 = map;
            if ((i & 64) != 0) {
                list = pendingIntent.KWHzl;
            }
            return pendingIntent.EZpvd(str, str6, str7, str8, str9, map2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new PendingIntent(str, str2, str3, str4, str5, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pendingIntent.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pendingIntent.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) pendingIntent.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) pendingIntent.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pendingIntent.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, pendingIntent.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, pendingIntent.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = this.AhwBna.hashCode();
            int iHashCode5 = this.EZpvd.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.AYXKKw;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeHomeFullPageViewAction(chainId=" + this.OLrzqt + ", pageName=" + this.copydefault + ", businessType=" + this.AEQbTJ + ", transactionType=" + this.AhwBna + ", orderType=" + this.EZpvd + ", params=" + this.AYXKKw + ", enumerableKeyList=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r15v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:38)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:31) call: o.hel.PendingIntent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.List):void type: THIS */
        public /* synthetic */ PendingIntent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? yDY.AhwBna() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = str;
            this.copydefault = str2;
            this.AEQbTJ = str3;
            this.AhwBna = str4;
            this.EZpvd = str5;
            this.AYXKKw = map;
            this.KWHzl = list;
        }
    }

    /* JADX INFO: renamed from: o.hel$ActionBar */
    public static final class ActionBar extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.hel$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.gEmmrt;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = actionBar.OLrzqt;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(str, str6, str7, str8, str9, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new ActionBar(str, str2, str3, str4, str5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeHomeFullPageClickAction(chainId=" + this.KWHzl + ", pageName=" + this.copydefault + ", businessType=" + this.AEQbTJ + ", transactionType=" + this.gEmmrt + ", orderType=" + this.OLrzqt + ", params=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.AEQbTJ = str3;
            this.gEmmrt = str4;
            this.OLrzqt = str5;
            this.EZpvd = map;
        }
    }

    /* JADX INFO: renamed from: o.hel$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final C22404hei OLrzqt;
        public final java.lang.String copydefault;
        public final java.util.Map<java.lang.String, java.lang.String> gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.hel$TaskStackBuilder */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, C22404hei c22404hei, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskStackBuilder.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = taskStackBuilder.KWHzl;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = taskStackBuilder.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = taskStackBuilder.valueOf;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = taskStackBuilder.EZpvd;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                c22404hei = taskStackBuilder.OLrzqt;
            }
            C22404hei c22404hei2 = c22404hei;
            if ((i & 64) != 0) {
                map = taskStackBuilder.gEmmrt;
            }
            return taskStackBuilder.AEQbTJ(str, str6, str7, str8, str9, c22404hei2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull C22404hei c22404hei, java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(c22404hei, "");
            return new TaskStackBuilder(str, str2, str3, str4, str5, c22404hei, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C22404hei KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskStackBuilder)) {
                return false;
            }
            TaskStackBuilder taskStackBuilder = (TaskStackBuilder) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskStackBuilder.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskStackBuilder.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskStackBuilder.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) taskStackBuilder.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskStackBuilder.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, taskStackBuilder.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, taskStackBuilder.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = this.valueOf.hashCode();
            int iHashCode5 = this.EZpvd.hashCode();
            int iHashCode6 = this.OLrzqt.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.gEmmrt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeSelectDappClickAction(chainId=" + this.copydefault + ", pageName=" + this.KWHzl + ", businessType=" + this.AEQbTJ + ", transactionType=" + this.valueOf + ", orderType=" + this.EZpvd + ", eventTransactionBaseProperty=" + this.OLrzqt + ", params=" + this.gEmmrt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskStackBuilder(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull C22404hei c22404hei, java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(c22404hei, "");
            this.copydefault = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
            this.valueOf = str4;
            this.EZpvd = str5;
            this.OLrzqt = c22404hei;
            this.gEmmrt = map;
        }
    }

    /* JADX INFO: renamed from: o.hel$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final C22404hei EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;
        public final java.util.Map<java.lang.String, java.lang.String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C22404hei KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull C22404hei c22404hei, java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(c22404hei, "");
            return new VoiceInteractor(str, str2, str3, str4, str5, str6, c22404hei, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceInteractor)) {
                return false;
            }
            VoiceInteractor voiceInteractor = (VoiceInteractor) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) voiceInteractor.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) voiceInteractor.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) voiceInteractor.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) voiceInteractor.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) voiceInteractor.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) voiceInteractor.djBIcL) && Intrinsics.EZpvd(this.EZpvd, voiceInteractor.EZpvd) && Intrinsics.EZpvd(this.valueOf, voiceInteractor.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = this.gEmmrt.hashCode();
            int iHashCode5 = this.KWHzl.hashCode();
            int iHashCode6 = this.djBIcL.hashCode();
            int iHashCode7 = this.EZpvd.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.valueOf;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeSelectDappViewAction(chainId=" + this.AEQbTJ + ", pageName=" + this.copydefault + ", businessType=" + this.OLrzqt + ", transactionType=" + this.gEmmrt + ", orderType=" + this.KWHzl + ", walletAddress=" + this.djBIcL + ", eventTransactionBaseProperty=" + this.EZpvd + ", params=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull C22404hei c22404hei, java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(c22404hei, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.gEmmrt = str4;
            this.KWHzl = str5;
            this.djBIcL = str6;
            this.EZpvd = c22404hei;
            this.valueOf = map;
        }
    }

    /* JADX INFO: renamed from: o.hel$Dialog */
    public static final class Dialog extends AbstractC22407hel {
        public final C22396hea KWHzl;
        public final C22402heg OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, C22402heg c22402heg, C22396hea c22396hea, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c22402heg = dialog.OLrzqt;
            }
            if ((i & 2) != 0) {
                c22396hea = dialog.KWHzl;
            }
            return dialog.copydefault(c22402heg, c22396hea);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C22396hea EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C22402heg copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog copydefault(@NotNull C22402heg c22402heg, @NotNull C22396hea c22396hea) {
            Intrinsics.checkNotNullParameter(c22402heg, "");
            Intrinsics.checkNotNullParameter(c22396hea, "");
            return new Dialog(c22402heg, c22396hea);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.EZpvd(this.OLrzqt, dialog.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, dialog.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeHomeFullPageSubmitClickAction(commonProperty=" + this.OLrzqt + ", eventSubmitCommonProperty=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull C22402heg c22402heg, @NotNull C22396hea c22396hea) {
            super(null);
            Intrinsics.checkNotNullParameter(c22402heg, "");
            Intrinsics.checkNotNullParameter(c22396hea, "");
            this.OLrzqt = c22402heg;
            this.KWHzl = c22396hea;
        }
    }

    /* JADX INFO: renamed from: o.hel$StateListAnimator */
    public static final class StateListAnimator extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.hel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = stateListAnimator.copydefault;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = stateListAnimator.valueOf;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = stateListAnimator.OLrzqt;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(str, str6, str7, str8, str9, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new StateListAnimator(str, str2, str3, str4, str5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            int iHashCode4 = this.valueOf.hashCode();
            int iHashCode5 = this.OLrzqt.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeConfirmPageViewAction(chainId=" + this.AEQbTJ + ", pageName=" + this.KWHzl + ", businessType=" + this.copydefault + ", transactionType=" + this.valueOf + ", orderType=" + this.OLrzqt + ", params=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.copydefault = str3;
            this.valueOf = str4;
            this.OLrzqt = str5;
            this.EZpvd = map;
        }
    }

    /* JADX INFO: renamed from: o.hel$Activity */
    public static final class Activity extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.Map<java.lang.String, java.lang.String> copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.hel$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = activity.OLrzqt;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = activity.valueOf;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = activity.AEQbTJ;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = activity.copydefault;
            }
            return activity.AEQbTJ(str, str6, str7, str8, str9, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new Activity(str, str2, str3, str4, str5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = this.valueOf.hashCode();
            int iHashCode5 = this.AEQbTJ.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeConfirmPageClickAction(chainId=" + this.KWHzl + ", pageName=" + this.EZpvd + ", businessType=" + this.OLrzqt + ", transactionType=" + this.valueOf + ", orderType=" + this.AEQbTJ + ", params=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.valueOf = str4;
            this.AEQbTJ = str5;
            this.copydefault = map;
        }
    }

    /* JADX INFO: renamed from: o.hel$AssistContent */
    public static final class AssistContent extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.util.Map<java.lang.String, java.lang.String> gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.hel$AssistContent */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = assistContent.KWHzl;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = assistContent.OLrzqt;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = assistContent.valueOf;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = assistContent.copydefault;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = assistContent.gEmmrt;
            }
            java.util.Map map2 = map;
            if ((i & 64) != 0) {
                list = assistContent.EZpvd;
            }
            return assistContent.copydefault(str, str6, str7, str8, str9, map2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new AssistContent(str, str2, str3, str4, str5, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssistContent)) {
                return false;
            }
            AssistContent assistContent = (AssistContent) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) assistContent.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) assistContent.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) assistContent.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) assistContent.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) assistContent.copydefault) && Intrinsics.EZpvd(this.gEmmrt, assistContent.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, assistContent.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = this.valueOf.hashCode();
            int iHashCode5 = this.copydefault.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.gEmmrt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeReferralPageViewAction(chainId=" + this.AEQbTJ + ", pageName=" + this.KWHzl + ", businessType=" + this.OLrzqt + ", transactionType=" + this.valueOf + ", orderType=" + this.copydefault + ", params=" + this.gEmmrt + ", enumerableKeyList=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r15v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:105)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:98) call: o.hel.AssistContent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.List):void type: THIS */
        public /* synthetic */ AssistContent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? yDY.AhwBna() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
            this.valueOf = str4;
            this.copydefault = str5;
            this.gEmmrt = map;
            this.EZpvd = list;
        }
    }

    /* JADX INFO: renamed from: o.hel$Fragment */
    public static final class Fragment extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.util.Map<java.lang.String, java.lang.String> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.hel$Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = fragment.OLrzqt;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = fragment.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = fragment.djBIcL;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = fragment.copydefault;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = fragment.gEmmrt;
            }
            java.util.Map map2 = map;
            if ((i & 64) != 0) {
                list = fragment.EZpvd;
            }
            return fragment.EZpvd(str, str6, str7, str8, str9, map2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Fragment(str, str2, str3, str4, str5, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) fragment.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fragment.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fragment.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) fragment.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragment.copydefault) && Intrinsics.EZpvd(this.gEmmrt, fragment.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, fragment.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = this.djBIcL.hashCode();
            int iHashCode5 = this.copydefault.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.gEmmrt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexTradeReferralEventClickAction(chainId=" + this.KWHzl + ", pageName=" + this.OLrzqt + ", businessType=" + this.AEQbTJ + ", transactionType=" + this.djBIcL + ", orderType=" + this.copydefault + ", params=" + this.gEmmrt + ", enumerableKeyList=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r15v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:115)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:108) call: o.hel.Fragment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.List):void type: THIS */
        public /* synthetic */ Fragment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? yDY.AhwBna() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
            this.djBIcL = str4;
            this.copydefault = str5;
            this.gEmmrt = map;
            this.EZpvd = list;
        }
    }

    /* JADX INFO: renamed from: o.hel$TaskDescription */
    public static final class TaskDescription extends AbstractC22407hel {
        public final C19818gQl AEQbTJ;
        public final OrderAndPositionTab KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, OrderAndPositionTab orderAndPositionTab, C19818gQl c19818gQl, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                orderAndPositionTab = taskDescription.KWHzl;
            }
            if ((i & 4) != 0) {
                c19818gQl = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(str, orderAndPositionTab, c19818gQl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C19818gQl AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrderAndPositionTab EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, @NotNull OrderAndPositionTab orderAndPositionTab, C19818gQl c19818gQl) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
            return new TaskDescription(str, orderAndPositionTab, c19818gQl);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            C19818gQl c19818gQl = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (c19818gQl == null ? 0 : c19818gQl.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexOrderComponentViewAction(chainId=" + this.copydefault + ", tab=" + this.KWHzl + ", params=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull OrderAndPositionTab orderAndPositionTab, C19818gQl c19818gQl) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
            this.copydefault = str;
            this.KWHzl = orderAndPositionTab;
            this.AEQbTJ = c19818gQl;
        }
    }

    /* JADX INFO: renamed from: o.hel$Application */
    public static final class Application extends AbstractC22407hel {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final OrderAndPositionTab OLrzqt;
        public final C19818gQl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, OrderAndPositionTab orderAndPositionTab, java.lang.String str2, C19818gQl c19818gQl, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                orderAndPositionTab = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = application.AEQbTJ;
            }
            if ((i & 8) != 0) {
                c19818gQl = application.copydefault;
            }
            return application.KWHzl(str, orderAndPositionTab, str2, c19818gQl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrderAndPositionTab AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C19818gQl KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, @NotNull OrderAndPositionTab orderAndPositionTab, @NotNull java.lang.String str2, C19818gQl c19818gQl) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, orderAndPositionTab, str2, c19818gQl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            C19818gQl c19818gQl = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c19818gQl == null ? 0 : c19818gQl.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DexOrderComponentClickAction(chainId=" + this.KWHzl + ", tab=" + this.OLrzqt + ", buttonName=" + this.AEQbTJ + ", params=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull OrderAndPositionTab orderAndPositionTab, @NotNull java.lang.String str2, C19818gQl c19818gQl) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.OLrzqt = orderAndPositionTab;
            this.AEQbTJ = str2;
            this.copydefault = c19818gQl;
        }
    }
}
