package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C26115jSm;
import o.C26118jSp;
import o.C26119jSq;
import o.C26120jSr;
import o.C26122jSt;
import o.C26169jUm;
import o.C26170jUn;
import o.C26175jUs;
import o.C49373unN;
import o.InterfaceC49371unL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesListViewModel extends AbstractC49411unz<Application> {
    public final C26120jSr AEQbTJ;
    public final C26118jSp EZpvd;
    public final C26115jSm KWHzl;
    public final C26119jSq OLrzqt;
    public final C26122jSt copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketFavoritesListViewModel(@NotNull C26115jSm c26115jSm, @NotNull C26120jSr c26120jSr, @NotNull C26122jSt c26122jSt, @NotNull C26118jSp c26118jSp, @NotNull C26119jSq c26119jSq) {
        super(new Application(null, null, null, null, null, 31, null));
        Intrinsics.checkNotNullParameter(c26115jSm, "");
        Intrinsics.checkNotNullParameter(c26120jSr, "");
        Intrinsics.checkNotNullParameter(c26122jSt, "");
        Intrinsics.checkNotNullParameter(c26118jSp, "");
        Intrinsics.checkNotNullParameter(c26119jSq, "");
        this.KWHzl = c26115jSm;
        this.AEQbTJ = c26120jSr;
        this.copydefault = c26122jSt;
        this.EZpvd = c26118jSp;
        this.OLrzqt = c26119jSq;
    }

    public static final class Application extends AbstractC49408unw<Application> {
        public InterfaceC49371unL<? extends Pair<? extends List<String>, ? extends List<String>>> AEQbTJ;
        public InterfaceC49371unL<Unit> EZpvd;
        public InterfaceC49371unL<? extends List<C26169jUm>> KWHzl;
        public InterfaceC49371unL<? extends Pair<C26170jUn, ? extends List<C26175jUs>>> OLrzqt;
        public InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, InterfaceC49371unL interfaceC49371unL4, InterfaceC49371unL interfaceC49371unL5, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                interfaceC49371unL2 = application.copydefault;
            }
            InterfaceC49371unL interfaceC49371unL6 = interfaceC49371unL2;
            if ((i & 4) != 0) {
                interfaceC49371unL3 = application.KWHzl;
            }
            InterfaceC49371unL interfaceC49371unL7 = interfaceC49371unL3;
            if ((i & 8) != 0) {
                interfaceC49371unL4 = application.AEQbTJ;
            }
            InterfaceC49371unL interfaceC49371unL8 = interfaceC49371unL4;
            if ((i & 16) != 0) {
                interfaceC49371unL5 = application.EZpvd;
            }
            return application.AEQbTJ(interfaceC49371unL, interfaceC49371unL6, interfaceC49371unL7, interfaceC49371unL8, interfaceC49371unL5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull InterfaceC49371unL<? extends Pair<C26170jUn, ? extends List<C26175jUs>>> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>> interfaceC49371unL2, @NotNull InterfaceC49371unL<? extends List<C26169jUm>> interfaceC49371unL3, @NotNull InterfaceC49371unL<? extends Pair<? extends List<String>, ? extends List<String>>> interfaceC49371unL4, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL5) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL4, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL5, "");
            return new Application(interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3, interfaceC49371unL4, interfaceC49371unL5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>>>, o.unL<kotlin.Pair<java.util.List<java.lang.String>, java.util.List<java.lang.String>>> */
        public final InterfaceC49371unL<Pair<List<String>, List<String>>> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull InterfaceC49371unL<? extends Pair<? extends List<String>, ? extends List<String>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.AEQbTJ = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<o.jUs>>>, o.unL<kotlin.Pair<java.lang.String, java.util.List<o.jUs>>> */
        public final InterfaceC49371unL<Pair<String, List<C26175jUs>>> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<o.jUn, ? extends java.util.List<o.jUs>>>, o.unL<kotlin.Pair<o.jUn, java.util.List<o.jUs>>> */
        public final InterfaceC49371unL<Pair<C26170jUn, List<C26175jUs>>> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull InterfaceC49371unL<? extends Pair<C26170jUn, ? extends List<C26175jUs>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.OLrzqt = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<Unit> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.jUm>>, o.unL<java.util.List<o.jUm>> */
        public final InterfaceC49371unL<List<C26169jUm>> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull InterfaceC49371unL<? extends List<C26169jUm>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MarketFavoritesUiState(favoritesCryptoListUiState=" + this.OLrzqt + ", removeFromGroupUiState=" + this.copydefault + ", customGroupsUiState=" + this.KWHzl + ", addToGroupUiState=" + this.AEQbTJ + ", rearrangeInGroupUiState=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:32) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 o.unL))
  (wrap:o.unL:0x0014: TERNARY null = ((wrap:int:0x000b: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:33) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 o.unL))
  (wrap:o.unL:0x001e: TERNARY null = ((wrap:int:0x0015: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x001b: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:34) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.unL))
  (wrap:o.unL:0x0028: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0025: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0029: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x002f: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:36) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 o.unL))
 A[MD:(o.unL<? extends kotlin.Pair<o.jUn, ? extends java.util.List<o.jUs>>>, o.unL<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<o.jUs>>>, o.unL<? extends java.util.List<o.jUm>>, o.unL<? extends kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>>>, o.unL<kotlin.Unit>):void (m)] (LINE:31) call: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel.Application.<init>(o.unL, o.unL, o.unL, o.unL, o.unL):void type: THIS */
        public /* synthetic */ Application(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, InterfaceC49371unL interfaceC49371unL4, InterfaceC49371unL interfaceC49371unL5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i & 4) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL3, (i & 8) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL4, (i & 16) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull InterfaceC49371unL<? extends Pair<C26170jUn, ? extends List<C26175jUs>>> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>> interfaceC49371unL2, @NotNull InterfaceC49371unL<? extends List<C26169jUm>> interfaceC49371unL3, @NotNull InterfaceC49371unL<? extends Pair<? extends List<String>, ? extends List<String>>> interfaceC49371unL4, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL5) {
            super(new Function1() { // from class: o.jUx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketFavoritesListViewModel.Application.copydefault((MarketFavoritesListViewModel.Application) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL4, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL5, "");
            this.OLrzqt = interfaceC49371unL;
            this.copydefault = interfaceC49371unL2;
            this.KWHzl = interfaceC49371unL3;
            this.AEQbTJ = interfaceC49371unL4;
            this.EZpvd = interfaceC49371unL5;
        }

        public static final Application copydefault(Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return copy$default(application, null, null, null, null, null, 31, null);
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel$loadFavoritesListByGroup$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).KWHzl((InterfaceC49371unL) obj2);
            }
        }, null, null, new MarketFavoritesListViewModel$loadFavoritesListByGroup$2(this, str, null), 6, null);
    }

    public final void AEQbTJ(String str, @NotNull List<C26175jUs> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).OLrzqt((InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>>) obj2);
            }
        }, null, null, new MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$2(this, str, list, null), 6, null);
    }

    public final void AEQbTJ(String str) {
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).copydefault((InterfaceC49371unL<? extends List<C26169jUm>>) obj2);
            }
        }, null, null, new MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$2(this, str, null), 6, null);
    }

    public final void KWHzl(@NotNull List<MarketFavoritesGroupPo.FavoritesPo> list, @NotNull List<C26169jUm> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel$requestAddCryptosToGroups$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).AEQbTJ((InterfaceC49371unL) obj2);
            }
        }, null, null, new MarketFavoritesListViewModel$requestAddCryptosToGroups$2(this, list, list2, null), 6, null);
    }

    public final void EZpvd(@NotNull String str, @NotNull List<C26175jUs> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel$requestRearrangeFavoritesListInGroup$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).EZpvd((InterfaceC49371unL) obj2);
            }
        }, null, null, new MarketFavoritesListViewModel$requestRearrangeFavoritesListInGroup$2(this, str, list, null), 6, null);
    }
}
