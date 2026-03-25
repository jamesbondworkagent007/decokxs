package com.reown.sign.engine.use_case.calls;

import com.reown.android.Core;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetPairingForSessionAuthenticateUseCase {
    public PairingInterface pairingProtocol;

    public GetPairingForSessionAuthenticateUseCase(@NotNull PairingInterface pairingInterface) {
        Intrinsics.checkNotNullParameter(pairingInterface, "");
        this.pairingProtocol = pairingInterface;
    }

    public final Core.Model.Pairing invoke(String str) throws Exception {
        Core.Model.Pairing pairingCreate;
        Object next;
        if (str != null) {
            Iterator<T> it = this.pairingProtocol.getPairings().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((Core.Model.Pairing) next).getTopic(), (Object) str)) {
                    break;
                }
            }
            pairingCreate = (Core.Model.Pairing) next;
            if (pairingCreate == null) {
                throw new Exception("Pairing does not exist");
            }
        } else {
            pairingCreate = this.pairingProtocol.create(new Function1<Core.Model.Error, Unit>() { // from class: com.reown.sign.engine.use_case.calls.GetPairingForSessionAuthenticateUseCase$invoke$pairing$2
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Error error) throws Throwable {
                    invoke2(error);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Core.Model.Error error) throws Throwable {
                    Intrinsics.checkNotNullParameter(error, "");
                    throw error.getThrowable();
                }
            }, JsonRpcMethod.WC_SESSION_AUTHENTICATE);
            if (pairingCreate == null) {
                throw new Exception("Cannot create a pairing");
            }
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) pairingCreate.getRegisteredMethods(), (CharSequence) JsonRpcMethod.WC_SESSION_AUTHENTICATE, false, 2, (Object) null)) {
            return pairingCreate;
        }
        throw new Exception("Pairing does not support wc_sessionAuthenticate");
    }
}
