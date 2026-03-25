package com.okinc.okimcore.model.biz;

import com.okinc.okimcore.model.biz.AbsIMBizMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbsIMBizMessage<T> extends OKBizCustomMessage {
    public final String AEQbTJ = "im_biz_msg";
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sNE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbsIMBizMessage.KWHzl(this.OLrzqt);
        }
    });

    public abstract T EZpvd(@NotNull String str);

    public final T OLrzqt() {
        return (T) this.OLrzqt.getValue();
    }

    public static final Object KWHzl(AbsIMBizMessage absIMBizMessage) {
        String rawData = absIMBizMessage.getRawData();
        if (rawData == null) {
            rawData = "";
        }
        return absIMBizMessage.EZpvd(rawData);
    }

    public final void KWHzl(@NotNull OKBizCustomMessage oKBizCustomMessage) {
        Intrinsics.checkNotNullParameter(oKBizCustomMessage, "");
        setPushTitle(oKBizCustomMessage.getPushTitle());
        setContent(oKBizCustomMessage.getContent());
        setUrl(oKBizCustomMessage.getUrl());
        setJumpStatus(oKBizCustomMessage.getJumpStatus());
        setData(oKBizCustomMessage.getData());
        setBizType(oKBizCustomMessage.getBizType());
        setShowNotify(oKBizCustomMessage.isShowNotify());
        String str = this.AEQbTJ;
        T tOLrzqt = OLrzqt();
        pUU.EZpvd(str, "load bizData " + (tOLrzqt != null ? tOLrzqt.toString() : null));
    }
}
