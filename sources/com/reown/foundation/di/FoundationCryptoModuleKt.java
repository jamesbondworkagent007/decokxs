package com.reown.foundation.di;

import com.reown.foundation.crypto.data.repository.BaseClientIdJwtRepository;
import com.reown.foundation.crypto.data.repository.ClientIdJwtRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class FoundationCryptoModuleKt {
    public static final C59991ztT cryptoModule() {
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.foundation.di.FoundationCryptoModuleKt.cryptoModule.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                C07271 c07271 = new Function2<C60060zuj, C60053zuc, ClientIdJwtRepository>() { // from class: com.reown.foundation.di.FoundationCryptoModuleKt.cryptoModule.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ClientIdJwtRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new BaseClientIdJwtRepository() { // from class: com.reown.foundation.di.FoundationCryptoModuleKt.cryptoModule.1.1.1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.reown.foundation.crypto.data.repository.BaseClientIdJwtRepository
                            /* JADX INFO: renamed from: setKeyPair-FCmjpgM */
                            public void mo7198setKeyPairFCmjpgM(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                Intrinsics.checkNotNullParameter(str3, "");
                            }
                        };
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(ClientIdJwtRepository.class), null, c07271, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null);
    }
}
