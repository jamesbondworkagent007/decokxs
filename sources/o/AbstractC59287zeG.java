package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59287zeG extends AbstractC59258zde {
    public abstract InterfaceC56663yNs AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu);

    public abstract <S extends InterfaceC59098zad> S AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull Function0<? extends S> function0);

    public abstract InterfaceC56658yNn KWHzl(@NotNull C56929yXo c56929yXo);

    /* JADX INFO: renamed from: KWHzl */
    public abstract AbstractC59233zdF AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw);

    public abstract boolean KWHzl(@NotNull yNP ynp);

    public abstract java.util.Collection<AbstractC59233zdF> OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn);

    public abstract boolean copydefault(@NotNull InterfaceC59315zei interfaceC59315zei);

    /* JADX INFO: renamed from: o.zeG$TaskDescription */
    public static final class TaskDescription extends AbstractC59287zeG {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yNu;)Lo/yNs; */
        @Override // o.AbstractC59287zeG
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public InterfaceC56658yNn AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
            Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59287zeG
        public InterfaceC56658yNn KWHzl(@NotNull C56929yXo c56929yXo) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59287zeG
        public boolean KWHzl(@NotNull yNP ynp) {
            Intrinsics.checkNotNullParameter(ynp, "");
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59287zeG
        public boolean copydefault(@NotNull InterfaceC59315zei interfaceC59315zei) {
            Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
            return false;
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zfw;)Lo/zfw; */
        @Override // o.AbstractC59258zde
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public AbstractC59233zdF AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            return (AbstractC59233zdF) interfaceC59382zfw;
        }

        @Override // o.AbstractC59287zeG
        public java.util.Collection<AbstractC59233zdF> OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            java.util.Collection<AbstractC59233zdF> collectionBV_ = interfaceC56658yNn.fJNWhG().bV_();
            Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
            return collectionBV_;
        }

        @Override // o.AbstractC59287zeG
        public <S extends InterfaceC59098zad> S AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull Function0<? extends S> function0) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return function0.invoke();
        }
    }
}
