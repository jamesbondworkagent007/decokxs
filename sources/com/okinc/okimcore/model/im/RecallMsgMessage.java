package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.biz.AbsIMBizMessage;
import com.okinc.okimcore.model.biz.RecallMsgData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import o.C33129mqd;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class RecallMsgMessage extends AbsIMBizMessage<RecallMsgData> {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.RecallMsgMessage.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // com.okinc.okimcore.model.biz.AbsIMBizMessage
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public RecallMsgData EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            try {
                return (RecallMsgData) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) RecallMsgData.Companion.serializer(), str);
            } catch (Exception unused) {
                return new RecallMsgData((List) null, 1, (DefaultConstructorMarker) null);
            }
        }
        return new RecallMsgData((List) null, 1, (DefaultConstructorMarker) null);
    }
}
