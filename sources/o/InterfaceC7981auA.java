package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC8028auw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC7981auA<BigType extends InterfaceC8028auw<BigType>> {
    BigType AEQbTJ();

    InterfaceC8028auw.Activity<BigType> EZpvd();

    /* JADX INFO: renamed from: o.auA$ActionBar */
    public static final class ActionBar {
        public static <BigType extends InterfaceC8028auw<BigType>> BigType OLrzqt(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, @NotNull BigType bigtype) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            Intrinsics.checkNotNullParameter(bigtype, "");
            return (BigType) interfaceC7981auA.AEQbTJ().AEQbTJ(bigtype);
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType EZpvd(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, @NotNull BigType bigtype) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            Intrinsics.checkNotNullParameter(bigtype, "");
            return (BigType) interfaceC7981auA.AEQbTJ().EZpvd(bigtype);
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType KWHzl(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, @NotNull BigType bigtype) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            Intrinsics.checkNotNullParameter(bigtype, "");
            return (BigType) interfaceC7981auA.AEQbTJ().copydefault(bigtype);
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType AEQbTJ(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, @NotNull BigType bigtype) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            Intrinsics.checkNotNullParameter(bigtype, "");
            return (BigType) interfaceC7981auA.AEQbTJ().KWHzl(bigtype);
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType copydefault(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, @NotNull BigType bigtype) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            Intrinsics.checkNotNullParameter(bigtype, "");
            return (BigType) interfaceC7981auA.AEQbTJ().OLrzqt(bigtype);
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType EZpvd(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, int i) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            return (BigType) interfaceC7981auA.AEQbTJ().AEQbTJ(interfaceC7981auA.EZpvd().KWHzl(i));
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType KWHzl(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, int i) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            return (BigType) interfaceC7981auA.AEQbTJ().EZpvd(interfaceC7981auA.EZpvd().KWHzl(i));
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType AEQbTJ(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, int i) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            return (BigType) interfaceC7981auA.AEQbTJ().KWHzl(interfaceC7981auA.EZpvd().KWHzl(i));
        }

        public static <BigType extends InterfaceC8028auw<BigType>> BigType copydefault(@NotNull InterfaceC7981auA<BigType> interfaceC7981auA, int i) {
            Intrinsics.checkNotNullParameter(interfaceC7981auA, "");
            return (BigType) interfaceC7981auA.AEQbTJ().OLrzqt(interfaceC7981auA.EZpvd().KWHzl(i));
        }
    }
}
