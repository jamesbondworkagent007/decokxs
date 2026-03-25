package com.amplifyframework.ui.liveness.model;

import android.graphics.RectF;
import com.amplifyframework.ui.liveness.R;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LivenessCheckState {
    public static final int $stable = 0;
    public static final int COLOR_TYPE_GREEN = 1;
    public static final int COLOR_TYPE_RED = 2;
    public static final int COLOR_TYPE_WHITE = 0;
    public static final Companion Companion = new Companion(null);
    private final int colorType;
    private final Integer instructionId;
    private final boolean isActionable;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Integer), (r2v0 boolean), (r3v0 int) A[MD:(java.lang.Integer, boolean, int):void (m)] call: com.amplifyframework.ui.liveness.model.LivenessCheckState.<init>(java.lang.Integer, boolean, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LivenessCheckState(Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColorType() {
        return this.colorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInstructionId() {
        return this.instructionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActionable() {
        return this.isActionable;
    }

    private LivenessCheckState(Integer num, boolean z, int i) {
        this.instructionId = num;
        this.isActionable = z;
        this.colorType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:22) call: com.amplifyframework.ui.liveness.model.LivenessCheckState.<init>(java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ LivenessCheckState(Integer num, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0 : i, null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.model.LivenessCheckState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Initial extends LivenessCheckState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Initial() {
            this(null, false, 0, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(java.lang.Integer, boolean, int):void (m)] (LINE:31) call: com.amplifyframework.ui.liveness.model.LivenessCheckState.Initial.<init>(java.lang.Integer, boolean, int):void type: THIS */
        public /* synthetic */ Initial(Integer num, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0 : i);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.model.LivenessCheckState.Initial.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Initial withMoveFaceMessage() {
                return new Initial(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_move_infront_camera), false, 0, 6, null);
            }

            public final Initial withMultipleFaceMessage() {
                return new Initial(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_onlyone_check), false, 2, 2, null);
            }

            public final Initial withMoveFaceFurtherAwayMessage() {
                return new Initial(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_move_back), false, 2, 2, null);
            }

            public final Initial withConnectingMessage() {
                return new Initial(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_connecting), false, 0, 4, null);
            }

            public final Initial withStartViewMessage() {
                return new Initial(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_center_face), false, 0, 6, null);
            }
        }

        public Initial(Integer num, boolean z, int i) {
            super(num, z, i, null);
        }
    }

    public static final class Running extends LivenessCheckState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Running() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.model.LivenessCheckState.Running.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Running withMoveFaceMessage() {
                return new Running(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_move_closer), 1);
            }

            public final Running withMultipleFaceMessage() {
                return new Running(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_move_closer), 1);
            }

            public final Running withFaceOvalPosition(@NotNull FaceDetector.FaceOvalPosition faceOvalPosition) {
                Intrinsics.checkNotNullParameter(faceOvalPosition, "");
                return new Running(Integer.valueOf(faceOvalPosition.getInstructionStringRes()), faceOvalPosition.getColorType());
            }
        }

        public Running(Integer num, int i) {
            super(num, true, i, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.Integer, int):void (m)] (LINE:49) call: com.amplifyframework.ui.liveness.model.LivenessCheckState.Running.<init>(java.lang.Integer, int):void type: THIS */
        public /* synthetic */ Running(Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? 0 : i);
        }
    }

    public static final class Error extends LivenessCheckState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null, false, 0, 5, null);
        }
    }

    public static final class Success extends LivenessCheckState {
        public static final int $stable = 8;
        private final RectF faceGuideRect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RectF getFaceGuideRect() {
            return this.faceGuideRect;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.graphics.RectF)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(android.graphics.RectF, int):void (m)] (LINE:62) call: com.amplifyframework.ui.liveness.model.LivenessCheckState.Success.<init>(android.graphics.RectF, int):void type: THIS */
        public /* synthetic */ Success(RectF rectF, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(rectF, (i2 & 2) != 0 ? 0 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull RectF rectF, int i) {
            super(Integer.valueOf(R.string.pr_compliance_sdk_liveness_text_verifying), false, i, null);
            Intrinsics.checkNotNullParameter(rectF, "");
            this.faceGuideRect = rectF;
        }
    }
}
