package com.okinc.okimcore.model.biz;

import com.okinc.okimcore.model.biz.AbsOKInformationNotificationMessage;
import com.okinc.okimcore.model.im.OKInformationNotificationMessage;
import com.okinc.okimcore.model.other.InfoNtfExtraData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C33489mxS;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbsOKInformationNotificationMessage<T> extends OKInformationNotificationMessage {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sND
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbsOKInformationNotificationMessage.EZpvd(this.OLrzqt);
        }
    });
    public InfoNtfExtraData OLrzqt;

    public abstract T KWHzl(@NotNull String str);

    private final T KWHzl() {
        return (T) this.KWHzl.getValue();
    }

    public static final Object EZpvd(AbsOKInformationNotificationMessage absOKInformationNotificationMessage) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<InfoNtfExtraData> kSerializerSerializer = InfoNtfExtraData.Companion.serializer();
        String extra = absOKInformationNotificationMessage.getExtra();
        Intrinsics.copydefault((Object) extra);
        InfoNtfExtraData infoNtfExtraData = (InfoNtfExtraData) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, extra);
        absOKInformationNotificationMessage.OLrzqt = infoNtfExtraData;
        if (infoNtfExtraData == null) {
            Intrinsics.gEmmrt("");
            infoNtfExtraData = null;
        }
        return absOKInformationNotificationMessage.KWHzl(infoNtfExtraData.getBizData());
    }

    public final T AEQbTJ() {
        return KWHzl();
    }
}
