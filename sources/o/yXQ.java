package o;

import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public interface yXQ extends yXN {

    public interface StateListAnimator extends java.lang.Cloneable, yXN {
        /* JADX INFO: renamed from: KWHzl */
        StateListAnimator OLrzqt(yXG yxg, yXE yxe) throws java.io.IOException;

        yXQ OLrzqt();
    }

    yXV<? extends yXQ> getParserForType();

    int getSerializedSize();

    StateListAnimator newBuilderForType();

    StateListAnimator toBuilder();

    void writeTo(CodedOutputStream codedOutputStream) throws java.io.IOException;
}
