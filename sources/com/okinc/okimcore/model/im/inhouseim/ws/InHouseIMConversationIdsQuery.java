package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import o.C56392yDr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMConversationIdsQuery {
    public static final int $stable = 0;
    public static final InHouseIMConversationIdsQuery INSTANCE = new InHouseIMConversationIdsQuery();
    public static final /* synthetic */ InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return InHouseIMConversationIdsQuery.copydefault();
        }
    });

    private InHouseIMConversationIdsQuery() {
    }

    public static final /* synthetic */ KSerializer copydefault() {
        return new ObjectSerializer("com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer KWHzl() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<InHouseIMConversationIdsQuery> serializer() {
        return KWHzl();
    }
}
