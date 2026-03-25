package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C26121jSs;
import o.C26124jSv;
import o.C26125jSw;
import o.C26126jSx;
import o.C26127jSy;
import o.C26128jSz;
import o.C26170jUn;
import o.C49373unN;
import o.InterfaceC49371unL;
import o.InterfaceC56554yJr;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesGroupViewModel extends AbstractC49411unz<StateListAnimator> {
    public final C26121jSs AEQbTJ;
    public final C26125jSw EZpvd;
    public final C26127jSy KWHzl;
    public final C26128jSz OLrzqt;
    public final C26124jSv copydefault;
    public final C26126jSx djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketFavoritesGroupViewModel(@NotNull C26125jSw c26125jSw, @NotNull C26121jSs c26121jSs, @NotNull C26124jSv c26124jSv, @NotNull C26128jSz c26128jSz, @NotNull C26126jSx c26126jSx, @NotNull C26127jSy c26127jSy) {
        super(new StateListAnimator(null, null, null, null, null, null, 63, null));
        Intrinsics.checkNotNullParameter(c26125jSw, "");
        Intrinsics.checkNotNullParameter(c26121jSs, "");
        Intrinsics.checkNotNullParameter(c26124jSv, "");
        Intrinsics.checkNotNullParameter(c26128jSz, "");
        Intrinsics.checkNotNullParameter(c26126jSx, "");
        Intrinsics.checkNotNullParameter(c26127jSy, "");
        this.EZpvd = c26125jSw;
        this.AEQbTJ = c26121jSs;
        this.copydefault = c26124jSv;
        this.OLrzqt = c26128jSz;
        this.djBIcL = c26126jSx;
        this.KWHzl = c26127jSy;
    }

    public static final class StateListAnimator extends AbstractC49408unw<StateListAnimator> {
        public InterfaceC49371unL<String> AEQbTJ;
        public InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> EZpvd;
        public InterfaceC49371unL<String> KWHzl;
        public InterfaceC49371unL<Unit> OLrzqt;
        public InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> copydefault;
        public InterfaceC49371unL<? extends Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, InterfaceC49371unL interfaceC49371unL4, InterfaceC49371unL interfaceC49371unL5, InterfaceC49371unL interfaceC49371unL6, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                interfaceC49371unL2 = stateListAnimator.copydefault;
            }
            InterfaceC49371unL interfaceC49371unL7 = interfaceC49371unL2;
            if ((i & 4) != 0) {
                interfaceC49371unL3 = stateListAnimator.AEQbTJ;
            }
            InterfaceC49371unL interfaceC49371unL8 = interfaceC49371unL3;
            if ((i & 8) != 0) {
                interfaceC49371unL4 = stateListAnimator.KWHzl;
            }
            InterfaceC49371unL interfaceC49371unL9 = interfaceC49371unL4;
            if ((i & 16) != 0) {
                interfaceC49371unL5 = stateListAnimator.OLrzqt;
            }
            InterfaceC49371unL interfaceC49371unL10 = interfaceC49371unL5;
            if ((i & 32) != 0) {
                interfaceC49371unL6 = stateListAnimator.valueOf;
            }
            return stateListAnimator.copydefault(interfaceC49371unL, interfaceC49371unL7, interfaceC49371unL8, interfaceC49371unL9, interfaceC49371unL10, interfaceC49371unL6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<? extends java.util.List<o.jUn>, ? extends java.util.List<o.jUn>>>, o.unL<kotlin.Pair<java.util.List<o.jUn>, java.util.List<o.jUn>>> */
        public final InterfaceC49371unL<Pair<List<C26170jUn>, List<C26170jUn>>> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(@NotNull InterfaceC49371unL<? extends Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.valueOf = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<Unit> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<? extends java.util.List<o.jUn>, ? extends java.util.List<o.jUn>>>, o.unL<kotlin.Pair<java.util.List<o.jUn>, java.util.List<o.jUn>>> */
        public final InterfaceC49371unL<Pair<List<C26170jUn>, List<C26170jUn>>> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.OLrzqt = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<String> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull InterfaceC49371unL<String> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.AEQbTJ = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL2, @NotNull InterfaceC49371unL<String> interfaceC49371unL3, @NotNull InterfaceC49371unL<String> interfaceC49371unL4, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL5, @NotNull InterfaceC49371unL<? extends Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>> interfaceC49371unL6) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL4, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL5, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL6, "");
            return new StateListAnimator(interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3, interfaceC49371unL4, interfaceC49371unL5, interfaceC49371unL6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<String> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull InterfaceC49371unL<String> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.valueOf, stateListAnimator.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MarketFavoritesUiState(getAllGroupsUiState=" + this.EZpvd + ", getAllGroupsSilentlyUiState=" + this.copydefault + ", editGroupNameUiState=" + this.AEQbTJ + ", deleteGroupUiState=" + this.KWHzl + ", rearrangeGroupsUiState=" + this.OLrzqt + ", updateGroupVisibilityUiState=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<o.jUn>, ? extends java.util.List<o.jUn>>>>, o.unL<kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, kotlin.Pair<java.util.List<o.jUn>, java.util.List<o.jUn>>>> */
        public final InterfaceC49371unL<Pair<Pair<String, Boolean>, Pair<List<C26170jUn>, List<C26170jUn>>>> valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:31) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 o.unL))
  (wrap:o.unL:0x0014: TERNARY null = ((wrap:int:0x000b: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:32) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.unL))
  (wrap:o.unL:0x001e: TERNARY null = ((wrap:int:0x0015: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x001b: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:33) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 o.unL))
  (wrap:o.unL:0x0028: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0025: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:34) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 o.unL))
  (wrap:o.unL:0x0032: TERNARY null = ((wrap:int:0x0029: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x002f: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0033: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0039: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:36) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 o.unL))
 A[MD:(o.unL<? extends kotlin.Pair<? extends java.util.List<o.jUn>, ? extends java.util.List<o.jUn>>>, o.unL<? extends kotlin.Pair<? extends java.util.List<o.jUn>, ? extends java.util.List<o.jUn>>>, o.unL<java.lang.String>, o.unL<java.lang.String>, o.unL<kotlin.Unit>, o.unL<? extends kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<o.jUn>, ? extends java.util.List<o.jUn>>>>):void (m)] (LINE:30) call: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel.StateListAnimator.<init>(o.unL, o.unL, o.unL, o.unL, o.unL, o.unL):void type: THIS */
        public /* synthetic */ StateListAnimator(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, InterfaceC49371unL interfaceC49371unL4, InterfaceC49371unL interfaceC49371unL5, InterfaceC49371unL interfaceC49371unL6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i & 4) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL3, (i & 8) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL4, (i & 16) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL5, (i & 32) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL6);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL2, @NotNull InterfaceC49371unL<String> interfaceC49371unL3, @NotNull InterfaceC49371unL<String> interfaceC49371unL4, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL5, @NotNull InterfaceC49371unL<? extends Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>> interfaceC49371unL6) {
            super(new Function1() { // from class: o.jUu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketFavoritesGroupViewModel.StateListAnimator.KWHzl((MarketFavoritesGroupViewModel.StateListAnimator) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL4, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL5, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL6, "");
            this.EZpvd = interfaceC49371unL;
            this.copydefault = interfaceC49371unL2;
            this.AEQbTJ = interfaceC49371unL3;
            this.KWHzl = interfaceC49371unL4;
            this.OLrzqt = interfaceC49371unL5;
            this.valueOf = interfaceC49371unL6;
        }

        public static final StateListAnimator KWHzl(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return copy$default(stateListAnimator, null, null, null, null, null, null, 63, null);
        }
    }

    public static /* synthetic */ void loadFavoritesAllGroupsData$default(MarketFavoritesGroupViewModel marketFavoritesGroupViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        marketFavoritesGroupViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        InterfaceC56554yJr interfaceC56554yJr;
        if (z) {
            interfaceC56554yJr = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$loadFavoritesAllGroupsData$property$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((MarketFavoritesGroupViewModel.StateListAnimator) obj).AEQbTJ((InterfaceC49371unL) obj2);
                }
            };
        } else {
            interfaceC56554yJr = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$loadFavoritesAllGroupsData$property$2
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((MarketFavoritesGroupViewModel.StateListAnimator) obj).EZpvd((InterfaceC49371unL) obj2);
                }
            };
        }
        C49373unN.executeUseCase$default(this, interfaceC56554yJr, null, null, new MarketFavoritesGroupViewModel$loadFavoritesAllGroupsData$1(this, null), 6, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$requestCreateNewGroup$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, null, null, new MarketFavoritesGroupViewModel$requestCreateNewGroup$2(this, str, null), 6, null);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$requestModifyGroupName$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, null, null, new MarketFavoritesGroupViewModel$requestModifyGroupName$2(this, str, str2, null), 6, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$requestDeleteGroup$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).copydefault((InterfaceC49371unL<String>) obj2);
            }
        }, null, null, new MarketFavoritesGroupViewModel$requestDeleteGroup$2(this, str, null), 6, null);
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).valueOf();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).AhwBna((InterfaceC49371unL) obj2);
            }
        }, "requestUpdateGroupVisibility" + str, null, new MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$2(this, str, z, null), 4, null);
    }

    public final void KWHzl(@NotNull List<C26170jUn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C49373unN.executeUseCase$default(this, new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).KWHzl((InterfaceC49371unL<Unit>) obj2);
            }
        }, null, null, new MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$2(this, list, null), 6, null);
    }
}
