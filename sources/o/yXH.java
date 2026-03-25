package o;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import o.yXB;
import o.yXQ;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yXH<MessageType extends yXQ> implements yXV<MessageType> {
    public static final yXE copydefault = yXE.KWHzl();

    public final UninitializedMessageException KWHzl(MessageType messagetype) {
        if (messagetype instanceof yXB) {
            return ((yXB) messagetype).newUninitializedMessageException();
        }
        return new UninitializedMessageException(messagetype);
    }

    public final MessageType OLrzqt(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw KWHzl(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public MessageType KWHzl(yXD yxd, yXE yxe) throws InvalidProtocolBufferException {
        yXG yxgAYXKKw = yxd.AYXKKw();
        MessageType messagetypeEZpvd = EZpvd(yxgAYXKKw, yxe);
        try {
            yxgAYXKKw.EZpvd(0);
            return messagetypeEZpvd;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeEZpvd);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yXD;Lo/yXE;)Ljava/lang/Object; */
    @Override // o.yXV
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public MessageType copydefault(yXD yxd, yXE yxe) throws InvalidProtocolBufferException {
        return (MessageType) OLrzqt(KWHzl(yxd, yxe));
    }

    public MessageType djBIcL(java.io.InputStream inputStream, yXE yxe) throws InvalidProtocolBufferException {
        yXG yxgCopydefault = yXG.copydefault(inputStream);
        MessageType messagetypeEZpvd = EZpvd(yxgCopydefault, yxe);
        try {
            yxgCopydefault.EZpvd(0);
            return messagetypeEZpvd;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeEZpvd);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/io/InputStream;Lo/yXE;)Ljava/lang/Object; */
    @Override // o.yXV
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public MessageType AEQbTJ(java.io.InputStream inputStream, yXE yxe) throws InvalidProtocolBufferException {
        return (MessageType) OLrzqt(djBIcL(inputStream, yxe));
    }

    public MessageType copydefault(java.io.InputStream inputStream, yXE yxe) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) djBIcL(new yXB.ActionBar.StateListAnimator(inputStream, yXG.KWHzl(i, inputStream)), yxe);
        } catch (java.io.IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/io/InputStream;Lo/yXE;)Ljava/lang/Object; */
    @Override // o.yXV
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public MessageType KWHzl(java.io.InputStream inputStream, yXE yxe) throws InvalidProtocolBufferException {
        return (MessageType) OLrzqt(copydefault(inputStream, yxe));
    }
}
