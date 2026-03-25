package o;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import java.util.Collections;
import o.YM;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.crypto.hpke.HPKE;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes2.dex */
public class YP implements java.io.Closeable, YM {
    public final java.nio.channels.FileChannel OLrzqt;
    public final int copydefault = 1179403647;

    public YP(java.io.File file) throws java.io.FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new java.lang.IllegalArgumentException("File is null or does not exist");
        }
        this.OLrzqt = new java.io.FileInputStream(file).getChannel();
    }

    public YM.StateListAnimator OLrzqt() throws java.io.IOException {
        this.OLrzqt.position(0L);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (copydefault(byteBufferAllocate, 0L) != 1179403647) {
            throw new java.lang.IllegalArgumentException("Invalid ELF Magic!");
        }
        short sEZpvd = EZpvd(byteBufferAllocate, 4L);
        boolean z = EZpvd(byteBufferAllocate, 5L) == 2;
        if (sEZpvd == 1) {
            return new YK(z, this);
        }
        if (sEZpvd == 2) {
            return new YS(z, this);
        }
        throw new java.lang.IllegalStateException("Invalid class type!");
    }

    public java.util.List<java.lang.String> copydefault() throws java.io.IOException {
        long j;
        YM.Activity activityCopydefault;
        this.OLrzqt.position(0L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        YM.StateListAnimator stateListAnimatorOLrzqt = OLrzqt();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(stateListAnimatorOLrzqt.KWHzl ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = stateListAnimatorOLrzqt.AEQbTJ;
        int i = 0;
        if (j2 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j2 = stateListAnimatorOLrzqt.AEQbTJ(0).OLrzqt;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            YM.TaskDescription taskDescriptionAEQbTJ = stateListAnimatorOLrzqt.AEQbTJ(j3);
            if (taskDescriptionAEQbTJ.KWHzl == 2) {
                j = taskDescriptionAEQbTJ.EZpvd;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        long j4 = 0;
        do {
            activityCopydefault = stateListAnimatorOLrzqt.copydefault(j, i);
            long j5 = activityCopydefault.copydefault;
            if (j5 == 1) {
                arrayList2.add(java.lang.Long.valueOf(activityCopydefault.AEQbTJ));
            } else if (j5 == 5) {
                j4 = activityCopydefault.AEQbTJ;
            }
            i++;
        } while (activityCopydefault.copydefault != 0);
        if (j4 == 0) {
            throw new java.lang.IllegalStateException("String table offset not found!");
        }
        long jOLrzqt = OLrzqt(stateListAnimatorOLrzqt, j2, j4);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ(byteBufferAllocate, ((java.lang.Long) it.next()).longValue() + jOLrzqt));
        }
        return arrayList;
    }

    public final long OLrzqt(YM.StateListAnimator stateListAnimator, long j, long j2) throws java.io.IOException {
        for (long j3 = 0; j3 < j; j3++) {
            YM.TaskDescription taskDescriptionAEQbTJ = stateListAnimator.AEQbTJ(j3);
            if (taskDescriptionAEQbTJ.KWHzl == 1) {
                long j4 = taskDescriptionAEQbTJ.OLrzqt;
                if (j4 <= j2 && j2 <= taskDescriptionAEQbTJ.copydefault + j4) {
                    return (j2 - j4) + taskDescriptionAEQbTJ.EZpvd;
                }
            }
        }
        throw new java.lang.IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.OLrzqt.close();
    }

    public java.lang.String AEQbTJ(java.nio.ByteBuffer byteBuffer, long j) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            short sEZpvd = EZpvd(byteBuffer, j);
            if (sEZpvd != 0) {
                sb.append((char) sEZpvd);
                j++;
            } else {
                return sb.toString();
            }
        }
    }

    public long KWHzl(java.nio.ByteBuffer byteBuffer, long j) throws java.io.IOException {
        EZpvd(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public long copydefault(java.nio.ByteBuffer byteBuffer, long j) throws java.io.IOException {
        EZpvd(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & BodyPartID.bodyIdMax;
    }

    public int OLrzqt(java.nio.ByteBuffer byteBuffer, long j) throws java.io.IOException {
        EZpvd(byteBuffer, j, 2);
        return byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    public short EZpvd(java.nio.ByteBuffer byteBuffer, long j) throws java.io.IOException {
        EZpvd(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
    }

    public void EZpvd(java.nio.ByteBuffer byteBuffer, long j, int i) throws java.io.IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int i2 = this.OLrzqt.read(byteBuffer, j + j2);
            if (i2 == -1) {
                throw new java.io.EOFException();
            }
            j2 += (long) i2;
        }
        byteBuffer.position(0);
    }
}
