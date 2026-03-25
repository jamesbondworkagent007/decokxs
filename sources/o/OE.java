package o;

import java.util.Queue;
import o.OO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OE<T extends OO> {
    public final Queue<T> EZpvd = SI.copydefault(20);

    public abstract T KWHzl();

    public T OLrzqt() {
        T tPoll = this.EZpvd.poll();
        return tPoll == null ? (T) KWHzl() : tPoll;
    }

    public void AEQbTJ(T t) {
        if (this.EZpvd.size() < 20) {
            this.EZpvd.offer(t);
        }
    }
}
