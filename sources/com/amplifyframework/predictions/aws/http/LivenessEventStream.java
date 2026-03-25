package com.amplifyframework.predictions.aws.http;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C56393yDs;
import o.C56395yDu;
import o.yDB;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessEventStream {
    public static final LivenessEventStream INSTANCE = new LivenessEventStream();
    private static final Logger LOG;

    private LivenessEventStream() {
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.PREDICTIONS, "amplify:aws-predictions");
        Intrinsics.checkNotNullExpressionValue(logger, "");
        LOG = logger;
    }

    public final ByteBuffer encode(@NotNull byte[] bArr, @NotNull Map<String, ? extends Object> map) {
        int i;
        int length;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(map, "");
        int i2 = 0;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            int length2 = i2 + entry.getKey().length();
            if (entry.getValue() instanceof String) {
                Object value = entry.getValue();
                Intrinsics.copydefault(value, "");
                length = ((String) value).length();
            } else if (entry.getValue() instanceof Date) {
                i2 = length2 + 10;
            } else {
                Object value2 = entry.getValue();
                Intrinsics.copydefault(value2, "");
                length = ((byte[]) value2).length;
            }
            i2 = length2 + length + 4;
        }
        int length3 = bArr.length + 16 + i2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length3);
        byteBufferAllocate.putInt(length3);
        byteBufferAllocate.putInt(i2);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(byteBufferAllocate.array(), 0, 8);
        CRC32 crc32 = new CRC32();
        crc32.update(bArrCopyOfRange);
        byteBufferAllocate.putInt((int) crc32.getValue());
        for (Map.Entry<String, ? extends Object> entry2 : map.entrySet()) {
            byteBufferAllocate.put(C56393yDs.copydefault((byte) entry2.getKey().length()));
            ByteString.Companion companion = ByteString.Companion;
            byteBufferAllocate.put(companion.encodeUtf8(entry2.getKey()).toByteArray());
            if (entry2.getValue() instanceof String) {
                i = 7;
            } else {
                i = entry2.getValue() instanceof Date ? 8 : 6;
            }
            byteBufferAllocate.put((byte) i);
            if (entry2.getValue() instanceof String) {
                Object value3 = entry2.getValue();
                Intrinsics.copydefault(value3, "");
                byteBufferAllocate.putShort(yDB.AEQbTJ((short) ((String) value3).length()));
            } else if (entry2.getValue() instanceof byte[]) {
                Object value4 = entry2.getValue();
                Intrinsics.copydefault(value4, "");
                byteBufferAllocate.putShort(yDB.AEQbTJ((short) ((byte[]) value4).length));
            }
            if (entry2.getValue() instanceof String) {
                Object value5 = entry2.getValue();
                Intrinsics.copydefault(value5, "");
                byteBufferAllocate.put(companion.encodeUtf8((String) value5).toByteArray());
            } else if (entry2.getValue() instanceof Date) {
                Object value6 = entry2.getValue();
                Intrinsics.copydefault(value6, "");
                byteBufferAllocate.putLong(((Date) value6).getTime());
            } else {
                Object value7 = entry2.getValue();
                Intrinsics.copydefault(value7, "");
                byteBufferAllocate.put((byte[]) value7);
            }
        }
        byteBufferAllocate.put(bArr);
        CRC32 crc322 = new CRC32();
        crc322.update(Arrays.copyOfRange(byteBufferAllocate.array(), 0, length3 - 4));
        byteBufferAllocate.putInt((int) crc322.getValue());
        Buffer bufferPosition = byteBufferAllocate.position(0);
        Intrinsics.copydefault(bufferPosition, "");
        return (ByteBuffer) bufferPosition;
    }

    public final LivenessResponseStream decode(@NotNull ByteString byteString, @NotNull Json json) {
        String str = "";
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(json, "");
        if (byteString.size() < 16) {
            LOG.error("Error decoding liveness event stream data. Size should be at least 16 bytes, actual size is " + byteString.size() + JwtUtilsKt.JWT_DELIMITER);
            return null;
        }
        int i = 0;
        int iM6021toUInt32OGnWXxg = m6021toUInt32OGnWXxg(byteString.substring(0, 4).toByteArray());
        if (byteString.size() < iM6021toUInt32OGnWXxg) {
            LOG.error("Error decoding liveness event stream data. Prelude specifies data size of " + iM6021toUInt32OGnWXxg + ", actual size is " + byteString.size() + JwtUtilsKt.JWT_DELIMITER);
            return null;
        }
        int iM6021toUInt32OGnWXxg2 = m6021toUInt32OGnWXxg(byteString.substring(4, 8).toByteArray());
        int i2 = iM6021toUInt32OGnWXxg2 + 12;
        ByteString byteStringSubstring = byteString.substring(12, i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i < iM6021toUInt32OGnWXxg2) {
            byte b = byteStringSubstring.getByte(i);
            int i3 = i + 1;
            int i4 = b + i3;
            String strUtf8 = byteStringSubstring.substring(i3, i4).utf8();
            int i5 = i4 + 3;
            int iM6020toUInt16OGnWXxg = m6020toUInt16OGnWXxg(byteStringSubstring.substring(i4 + 1, i5).toByteArray()) + i5;
            linkedHashMap.put(strUtf8, byteStringSubstring.substring(i5, iM6020toUInt16OGnWXxg).utf8());
            i = iM6020toUInt16OGnWXxg;
        }
        String strUtf82 = byteString.substring(i2, ((byteString.size() - i2) - 4) + i2).utf8();
        if (linkedHashMap.keySet().contains(":event-type")) {
            str = "{\"" + linkedHashMap.get(":event-type") + "\":" + strUtf82 + "}";
        } else if (linkedHashMap.keySet().contains(":exception-type")) {
            str = "{\"" + linkedHashMap.get(":exception-type") + "\":" + strUtf82 + "}";
        }
        if (str.length() == 0) {
            LOG.error("Error deserializing liveness response.");
            return null;
        }
        json.getSerializersModule();
        return (LivenessResponseStream) json.decodeFromString(LivenessResponseStream.Companion.serializer(), str);
    }

    /* JADX INFO: renamed from: toUInt32-OGnWXxg, reason: not valid java name */
    private final int m6021toUInt32OGnWXxg(byte[] bArr) {
        return C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(bArr[3]) & 255) | C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(bArr[0]) & 255) << 24) | C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(bArr[1]) & 255) << 16)) | C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(bArr[2]) & 255) << 8)));
    }

    /* JADX INFO: renamed from: toUInt16-OGnWXxg, reason: not valid java name */
    private final int m6020toUInt16OGnWXxg(byte[] bArr) {
        return C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(bArr[1]) & 255) | C56395yDu.EZpvd(C56395yDu.EZpvd(C56395yDu.EZpvd(bArr[0]) & 255) << 8));
    }
}
