package com.okinc.nft.app;

import android.content.Context;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.okinc.nft.app.NFTModule;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C43048rht;
import o.C43265rly;
import o.C43308rmo;
import o.C43440rpN;
import o.C43443rpQ;
import o.C43444rpR;
import o.C43475rpw;
import o.C43515rqj;
import o.C43518rqm;
import o.C56392yDr;
import o.C57337ygX;
import o.C7381aik;
import o.InterfaceC43220rlF;
import o.InterfaceC43237rlW;
import o.InterfaceC43299rmf;
import o.InterfaceC9770bbp;
import o.InterfaceC9773bbs;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class NFTModule extends C43265rly {
    public static final int $stable = 0;

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return SubsamplingScaleImageView.ORIENTATION_270;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        if (C43308rmo.KWHzl(context)) {
            C43048rht.AEQbTJ.KWHzl("okluanft");
        }
        interfaceC43299rmf.EZpvd(InterfaceC9773bbs.class, C56392yDr.copydefault(new Function0() { // from class: o.rpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NFTModule.registerExtensions$lambda$0();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9770bbp.class, C56392yDr.copydefault(new Function0() { // from class: o.rpu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NFTModule.registerExtensions$lambda$1();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.rpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NFTModule.registerExtensions$lambda$2();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43515rqj registerExtensions$lambda$0() {
        return new C43515rqj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43443rpQ registerExtensions$lambda$1() {
        return new C43443rpQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43475rpw registerExtensions$lambda$2() {
        return new C43475rpw();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        super.registerCustomHandler(context, interfaceC43220rlF);
        C57337ygX.EZpvd(interfaceC43220rlF, new C43518rqm());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        Iterator it = yDY.gEmmrt(new C43444rpR("nft/featured", null, false, 6, null), new C43444rpR("nft/market", null, false, 6, null), new C43444rpR("nft/primary", null, false, 6, null), new C43444rpR("nft/ranking", null, false, 6, null), new C43444rpR("nft/market/details", null, false, 6, null), new C43444rpR("nft/collection", null, false, 6, null), new C43444rpR("nft/primary/details", null, false, 6, null), new C43444rpR("nft/search", null, false, 6, null), new C43444rpR("nft/creation", null, false, 6, null), new C43444rpR("nft/appmini", null, false, 6, null), new C43444rpR("wallet/home/nft", null, false, 6, null)).iterator();
        while (it.hasNext()) {
            interfaceC43237rlW.copydefault((C43444rpR) it.next(), C56392yDr.copydefault(new Function0() { // from class: o.rpq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return NFTModule.registerDeeplinkHandlers$lambda$4$lambda$3();
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43440rpN registerDeeplinkHandlers$lambda$4$lambda$3() {
        return new C43440rpN();
    }
}
