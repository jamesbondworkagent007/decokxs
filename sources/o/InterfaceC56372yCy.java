package o;

import j$.time.format.ResolverStyle;
import j$.time.temporal.ValueRange;

/* JADX INFO: renamed from: o.yCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56372yCy {
    InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt, long j);

    long getFrom(InterfaceC56365yCr interfaceC56365yCr);

    boolean isDateBased();

    boolean isSupportedBy(InterfaceC56365yCr interfaceC56365yCr);

    boolean isTimeBased();

    ValueRange range();

    ValueRange rangeRefinedBy(InterfaceC56365yCr interfaceC56365yCr);

    default InterfaceC56365yCr resolve(java.util.Map map, InterfaceC56365yCr interfaceC56365yCr, ResolverStyle resolverStyle) {
        return null;
    }
}
