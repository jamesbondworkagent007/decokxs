package com.okinc.liveness.lca.data;

import com.okinc.liveness.lca.ai.FaceDetector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45697sut;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class FaceCheckState {
    public static final int $stable = 0;
    public static final int COLOR_TYPE_GREEN = 1;
    public static final int COLOR_TYPE_RED = 2;
    public static final int COLOR_TYPE_WHITE = 0;
    public static final Companion Companion = new Companion(null);
    private final int instructionColorType;
    private final Integer instructionId;
    private final int ovalColorType;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Integer), (r2v0 int), (r3v0 int) A[MD:(java.lang.Integer, int, int):void (m)] call: com.okinc.liveness.lca.data.FaceCheckState.<init>(java.lang.Integer, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FaceCheckState(Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInstructionColorType() {
        return this.instructionColorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInstructionId() {
        return this.instructionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOvalColorType() {
        return this.ovalColorType;
    }

    private FaceCheckState(Integer num, int i, int i2) {
        this.instructionId = num;
        this.ovalColorType = i;
        this.instructionColorType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:6) call: com.okinc.liveness.lca.data.FaceCheckState.<init>(java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ FaceCheckState(Integer num, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.FaceCheckState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Initial extends FaceCheckState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Initial() {
            this(null, 0, 0, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.Integer, int, int):void (m)] (LINE:18) call: com.okinc.liveness.lca.data.FaceCheckState.Initial.<init>(java.lang.Integer, int, int):void type: THIS */
        public /* synthetic */ Initial(Integer num, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.FaceCheckState.Initial.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Initial withMoveFaceMessage() {
                return new Initial(Integer.valueOf(C45697sut.Application.AkhnZx), 2, 0, 4, null);
            }

            public final Initial withMultipleFaceMessage() {
                return new Initial(Integer.valueOf(C45697sut.Application.values), 2, 0, 4, null);
            }

            public final Initial withFaceOvalPosition(@NotNull FaceDetector.FaceOvalPosition faceOvalPosition) {
                Intrinsics.checkNotNullParameter(faceOvalPosition, "");
                int instructionStringRes = faceOvalPosition.getInstructionStringRes();
                return new Initial(Integer.valueOf(instructionStringRes), faceOvalPosition.getOvalColorType(), faceOvalPosition.getInstructionColorType());
            }
        }

        public Initial(Integer num, int i, int i2) {
            super(num, i, i2, null);
        }
    }

    public static final class Running extends FaceCheckState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Running() {
            this(null, 0, 0, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.Integer, int, int):void (m)] (LINE:45) call: com.okinc.liveness.lca.data.FaceCheckState.Running.<init>(java.lang.Integer, int, int):void type: THIS */
        public /* synthetic */ Running(Integer num, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.FaceCheckState.Running.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Running withMoveFaceMessage() {
                return new Running(Integer.valueOf(C45697sut.Application.AkhnZx), 2, 0, 4, null);
            }

            public final Running withMultipleFaceMessage() {
                return new Running(Integer.valueOf(C45697sut.Application.values), 2, 0, 4, null);
            }

            public final Running withFaceOvalPosition(@NotNull FaceDetector.FaceOvalPosition faceOvalPosition) {
                Intrinsics.checkNotNullParameter(faceOvalPosition, "");
                int instructionStringRes = faceOvalPosition.getInstructionStringRes();
                return new Running(Integer.valueOf(instructionStringRes), faceOvalPosition.getOvalColorType(), faceOvalPosition.getInstructionColorType());
            }
        }

        public Running(Integer num, int i, int i2) {
            super(num, i, i2, null);
        }
    }

    public static final class Error extends FaceCheckState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null, 0, 0, 7, null);
        }
    }

    public static final class Success extends FaceCheckState {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Success() {
            this(0, 1, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:71) call: com.okinc.liveness.lca.data.FaceCheckState.Success.<init>(int):void type: THIS */
        public /* synthetic */ Success(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public Success(int i) {
            super(null, i, 0, 4, null);
        }
    }
}
