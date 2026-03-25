package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.MenuItemHoverListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class MenuItemHoverListener {
    public static final Activity OLrzqt = new Activity(null);
    public final AbstractC7503al AEQbTJ;
    public final java.util.List<SmartSelectSprite> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MenuItemHoverListener$Application) A[MD:(o.MenuItemHoverListener$Application):void (m)] call: o.MenuItemHoverListener.<init>(o.MenuItemHoverListener$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MenuItemHoverListener(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SmartSelectSprite> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7503al EZpvd() {
        return this.AEQbTJ;
    }

    public MenuItemHoverListener(Application application) {
        this.EZpvd = application.AEQbTJ();
        this.AEQbTJ = application.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MenuItemHoverListener.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectFacesResponse(");
        sb.append("faceDetails=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("orientationCorrection=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<SmartSelectSprite> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        AbstractC7503al abstractC7503al = this.AEQbTJ;
        return (iHashCode * 31) + (abstractC7503al != null ? abstractC7503al.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MenuItemHoverListener.class != obj.getClass()) {
            return false;
        }
        MenuItemHoverListener menuItemHoverListener = (MenuItemHoverListener) obj;
        return Intrinsics.EZpvd(this.EZpvd, menuItemHoverListener.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, menuItemHoverListener.AEQbTJ);
    }

    public static /* synthetic */ MenuItemHoverListener copy$default(MenuItemHoverListener menuItemHoverListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectFacesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MenuItemHoverListener.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MenuItemHoverListener.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(menuItemHoverListener);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.util.List<SmartSelectSprite> EZpvd;
        public AbstractC7503al OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SmartSelectSprite> AEQbTJ() {
            return this.EZpvd;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<SmartSelectSprite> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7503al copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC7503al abstractC7503al) {
            this.OLrzqt = abstractC7503al;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull MenuItemHoverListener menuItemHoverListener) {
            this();
            Intrinsics.checkNotNullParameter(menuItemHoverListener, "");
            this.EZpvd = menuItemHoverListener.AEQbTJ();
            this.OLrzqt = menuItemHoverListener.EZpvd();
        }

        public final MenuItemHoverListener KWHzl() {
            return new MenuItemHoverListener(this, null);
        }
    }
}
