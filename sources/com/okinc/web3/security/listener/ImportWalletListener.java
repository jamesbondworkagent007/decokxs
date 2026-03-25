package com.okinc.web3.security.listener;

import com.okinc.web3.security.model.ButtonEvent;
import com.okinc.web3.security.model.TonAddress;
import com.okinc.web3.security.model.ValidSeedPhraseResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AbstractActivityC33041mov;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ImportWalletListener {
    void onActivityCreated(@NotNull AbstractActivityC33041mov abstractActivityC33041mov);

    void onButtonEvent(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull ButtonEvent buttonEvent);

    void onPrivateKeyValid(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull String str, @NotNull Function1<? super String, Unit> function1);

    void onSeedPhraseCollide(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull String str, @NotNull Function1<? super TonAddress, Unit> function1, @NotNull Function1<? super String, Unit> function12);

    void onSeedPhraseValid(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull ValidSeedPhraseResult validSeedPhraseResult, @NotNull Function1<? super String, Unit> function1);
}
