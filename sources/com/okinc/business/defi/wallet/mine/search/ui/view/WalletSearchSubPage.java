package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18962fsM;
import o.C18965fsP;
import o.C19012ftJ;
import o.C19033fte;
import o.C19056fuA;
import o.C56444yFp;
import o.InterfaceC19132fvX;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class WalletSearchSubPage implements InterfaceC19132fvX {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletSearchSubPage[] $VALUES;
    private final int titleResId;
    public static final WalletSearchSubPage ALL = new WalletSearchSubPage("ALL", 0) { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage.ALL
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C13754dXa.FragmentManager.dvKsVJ;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC19132fvX
        public Fragment createFragment(Bundle bundle) {
            return C19056fuA.Companion.OLrzqt(bundle);
        }
    };
    public static final WalletSearchSubPage TOKEN = new WalletSearchSubPage("TOKEN", 1) { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage.TOKEN
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C13754dXa.FragmentManager.gasjUx;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC19132fvX
        public Fragment createFragment(Bundle bundle) {
            return C19012ftJ.Companion.EZpvd(bundle);
        }
    };
    public static final WalletSearchSubPage DAPP = new WalletSearchSubPage("DAPP", 2) { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage.DAPP
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C13754dXa.FragmentManager.invokespecialsiEkQe;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC19132fvX
        public Fragment createFragment(Bundle bundle) {
            return C19033fte.Companion.OLrzqt(bundle);
        }
    };
    public static final WalletSearchSubPage ADDRESS = new WalletSearchSubPage("ADDRESS", 3) { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage.ADDRESS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C13754dXa.FragmentManager.flVtFt;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC19132fvX
        public Fragment createFragment(Bundle bundle) {
            return C18962fsM.Companion.KWHzl(bundle);
        }
    };
    public static final WalletSearchSubPage WALLET_ASSET = new WalletSearchSubPage("WALLET_ASSET", 4) { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage.WALLET_ASSET
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C13754dXa.FragmentManager.Rdimen;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC19132fvX
        public Fragment createFragment(Bundle bundle) {
            return C18965fsP.Companion.AEQbTJ(bundle);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletSearchSubPage[] $values() {
        return new WalletSearchSubPage[]{ALL, TOKEN, DAPP, ADDRESS, WALLET_ASSET};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int) A[MD:(java.lang.String, int, int):void (m)] call: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage.<init>(java.lang.String, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WalletSearchSubPage(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletSearchSubPage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC19132fvX
    public boolean onCompareContents(@NotNull InterfaceC19132fvX interfaceC19132fvX) {
        Intrinsics.checkNotNullParameter(interfaceC19132fvX, "");
        return this == interfaceC19132fvX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC19132fvX
    public boolean onCompareItems(@NotNull InterfaceC19132fvX interfaceC19132fvX) {
        Intrinsics.checkNotNullParameter(interfaceC19132fvX, "");
        return this == interfaceC19132fvX;
    }

    private WalletSearchSubPage(@StringRes String str, int i, int i2) {
        this.titleResId = i2;
    }

    static {
        WalletSearchSubPage[] walletSearchSubPageArr$values = $values();
        $VALUES = walletSearchSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletSearchSubPageArr$values);
    }

    public static WalletSearchSubPage valueOf(String str) {
        return (WalletSearchSubPage) Enum.valueOf(WalletSearchSubPage.class, str);
    }

    public static WalletSearchSubPage[] values() {
        return (WalletSearchSubPage[]) $VALUES.clone();
    }
}
