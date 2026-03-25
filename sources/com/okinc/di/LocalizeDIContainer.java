package com.okinc.di;

import com.okinc.di.LocalizeDIContainer;
import com.okinc.di.LocalizeDIModule;
import kotlin.jvm.functions.Function0;
import o.C38311pUb;
import o.C38319pUj;
import o.C43246rlf;
import o.C56392yDr;
import o.C58113yvE;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalizeDIContainer {
    public static final LocalizeDIContainer INSTANCE = new LocalizeDIContainer();
    private static final InterfaceC56387yDm languageUsageRepo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ngM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LocalizeDIContainer.languageUsageRepo_delegate$lambda$0();
        }
    });
    private static final InterfaceC56387yDm localizeResourceRepo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ngR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LocalizeDIContainer.localizeResourceRepo_delegate$lambda$1();
        }
    });
    public static final int $stable = 8;

    private LocalizeDIContainer() {
    }

    public final C38311pUb getLanguageUsageRepo() {
        return (C38311pUb) languageUsageRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38311pUb languageUsageRepo_delegate$lambda$0() {
        return ((LocalizeDIModule.StateListAnimator) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.StateListAnimator.class)).hUfVAv();
    }

    public final C38319pUj getLocalizeResourceRepo() {
        return (C38319pUj) localizeResourceRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38319pUj localizeResourceRepo_delegate$lambda$1() {
        return ((LocalizeDIModule.Application) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Application.class)).DAIeex();
    }
}
