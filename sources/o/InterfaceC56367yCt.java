package o;

/* JADX INFO: renamed from: o.yCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56367yCt extends InterfaceC56365yCr {
    InterfaceC56367yCt plus(long j, yCF ycf);

    long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf);

    InterfaceC56367yCt with(InterfaceC56372yCy interfaceC56372yCy, long j);

    default InterfaceC56367yCt with(InterfaceC56366yCs interfaceC56366yCs) {
        return interfaceC56366yCs.adjustInto(this);
    }

    default InterfaceC56367yCt AEQbTJ(InterfaceC56369yCv interfaceC56369yCv) {
        return interfaceC56369yCv.addTo(this);
    }

    default InterfaceC56367yCt minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }
}
