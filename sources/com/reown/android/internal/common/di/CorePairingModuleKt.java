package com.reown.android.internal.common.di;

import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.engine.domain.PairingEngine;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.domain.SendBatchEventUseCase;
import com.reown.foundation.util.Logger;
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
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class CorePairingModuleKt {
    public static final C59991ztT corePairingModule(@NotNull final PairingInterface pairingInterface, @NotNull final PairingControllerInterface pairingControllerInterface) {
        Intrinsics.checkNotNullParameter(pairingInterface, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.CorePairingModuleKt.corePairingModule.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

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
                C06971 c06971 = new Function2<C60060zuj, C60053zuc, PairingEngine>() { // from class: com.reown.android.internal.common.di.CorePairingModuleKt.corePairingModule.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PairingEngine invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        AppMetaData appMetaData = (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null);
                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                        MetadataStorageRepositoryInterface metadataStorageRepositoryInterface = (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null);
                        PairingStorageRepositoryInterface pairingStorageRepositoryInterface = (PairingStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingStorageRepositoryInterface.class), null, null);
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                        return new PairingEngine((Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null), appMetaData, metadataStorageRepositoryInterface, keyManagementRepository, relayJsonRpcInteractorInterface, pairingStorageRepositoryInterface, (InsertTelemetryEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (SendBatchEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SendBatchEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.USER_AGENT), null));
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(PairingEngine.class), null, c06971, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                final PairingInterface pairingInterface2 = pairingInterface;
                Function2<C60060zuj, C60053zuc, PairingInterface> function2 = new Function2<C60060zuj, C60053zuc, PairingInterface>() { // from class: com.reown.android.internal.common.di.CorePairingModuleKt.corePairingModule.1.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PairingInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return pairingInterface2;
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PairingInterface.class), null, function2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                final PairingControllerInterface pairingControllerInterface2 = pairingControllerInterface;
                Function2<C60060zuj, C60053zuc, PairingControllerInterface> function22 = new Function2<C60060zuj, C60053zuc, PairingControllerInterface>() { // from class: com.reown.android.internal.common.di.CorePairingModuleKt.corePairingModule.1.3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PairingControllerInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return pairingControllerInterface2;
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PairingControllerInterface.class), null, function22, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
            }
        }, 1, null);
    }
}
