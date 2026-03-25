package com.amplifyframework.ui.liveness.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SceneType {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.model.SceneType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SceneType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class DownScroll extends SceneType {
        public static final int $stable = 0;
        public static final DownScroll INSTANCE = new DownScroll();

        private DownScroll() {
            super(null);
        }
    }

    private SceneType() {
    }

    public static final class Flat extends SceneType {
        public static final int $stable = 0;
        public static final Flat INSTANCE = new Flat();

        private Flat() {
            super(null);
        }
    }
}
