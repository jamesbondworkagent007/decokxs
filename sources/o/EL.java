package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.AbstractC5110Fc;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EL implements InterfaceC5095En, InterfaceC5095En.ActionBar, InterfaceC5095En.Activity {
    public static final Application KWHzl = new Application(null);
    public static final java.util.Set<java.lang.String> OLrzqt = yEE.AhwBna("Infinity", "-Infinity", "NaN");
    public final EU copydefault;

    public EL(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault = EV.OLrzqt(bArr);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.EL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Integer>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonDeserializer$deserializeInt$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : (int) Double.parseDouble(str));
            }
        })).intValue();
    }

    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Long>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonDeserializer$deserializeLong$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
                return Long.valueOf(fieldNames != null ? fieldNames.longValue() : (long) Double.parseDouble(str));
            }
        })).longValue();
    }

    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return (float) AhwBna();
    }

    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Double>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonDeserializer$deserializeDouble$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Double invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return Double.valueOf(Double.parseDouble(str));
            }
        })).doubleValue();
    }

    public final <T> T copydefault(Function1<? super java.lang.String, ? extends T> function1) {
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ instanceof AbstractC5110Fc.Fragment) {
            return function1.invoke(((AbstractC5110Fc.Fragment) abstractC5110FcAEQbTJ).copydefault());
        }
        if (abstractC5110FcAEQbTJ instanceof AbstractC5110Fc.Dialog) {
            AbstractC5110Fc.Dialog dialog = (AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ;
            if (OLrzqt.contains(dialog.copydefault())) {
                return function1.invoke(dialog.copydefault());
            }
        }
        throw new DeserializationException(abstractC5110FcAEQbTJ + " cannot be deserialized as type Number");
    }

    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ instanceof AbstractC5110Fc.Dialog) {
            return ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ).copydefault();
        }
        if (abstractC5110FcAEQbTJ instanceof AbstractC5110Fc.Fragment) {
            return ((AbstractC5110Fc.Fragment) abstractC5110FcAEQbTJ).copydefault();
        }
        if (abstractC5110FcAEQbTJ instanceof AbstractC5110Fc.StateListAnimator) {
            return java.lang.String.valueOf(((AbstractC5110Fc.StateListAnimator) abstractC5110FcAEQbTJ).copydefault());
        }
        throw new DeserializationException(abstractC5110FcAEQbTJ + " cannot be deserialized as type String");
    }

    @Override // o.InterfaceC5095En
    public InterfaceC5095En.StateListAnimator EZpvd(@NotNull C5098Eq c5098Eq) {
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        AbstractC5110Fc abstractC5110FcValueOf = this.copydefault.valueOf();
        if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.ActionBar.OLrzqt)) {
            if (Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.FragmentManager.KWHzl)) {
                return new ER(this);
            }
            throw new DeserializationException("Unexpected token type " + this.copydefault.valueOf());
        }
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.ActionBar.class) {
            return new EP(this.copydefault, c5098Eq, this);
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.ActionBar.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
    }

    @Override // o.InterfaceC5095En.ActionBar, o.InterfaceC5095En.Activity
    public boolean copydefault() {
        return !Intrinsics.EZpvd(this.copydefault.valueOf(), AbstractC5110Fc.FragmentManager.KWHzl);
    }

    @Override // o.InterfaceC5095En.Activity
    public boolean OLrzqt() {
        AbstractC5110Fc abstractC5110FcValueOf = this.copydefault.valueOf();
        if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.PendingIntent.AEQbTJ)) {
            if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.FragmentManager.KWHzl) && !Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.TaskDescription.EZpvd)) {
                return true;
            }
        } else {
            AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
            if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.PendingIntent.class) {
            } else {
                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.PendingIntent.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
            }
        }
        return false;
    }

    @Override // o.InterfaceC5095En.ActionBar
    public boolean EZpvd() {
        AbstractC5110Fc abstractC5110FcValueOf = this.copydefault.valueOf();
        if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.Activity.AEQbTJ)) {
            if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.TaskDescription.EZpvd)) {
                return true;
            }
        } else {
            AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
            if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.Activity.class) {
            } else {
                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Activity.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
            }
        }
        return false;
    }

    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.StateListAnimator.class) {
            return ((AbstractC5110Fc.StateListAnimator) abstractC5110FcAEQbTJ).copydefault();
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.StateListAnimator.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
    }

    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.FragmentManager.class) {
            return null;
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.FragmentManager.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
    }

    @Override // o.InterfaceC5095En
    public InterfaceC5095En.ActionBar KWHzl(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.Application.class) {
            return this;
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Application.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
    }

    @Override // o.InterfaceC5095En
    public InterfaceC5095En.Activity AEQbTJ(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.ActionBar.class) {
            return this;
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.ActionBar.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
    }

    @Override // o.InterfaceC5095En.Activity
    public java.lang.String KWHzl() {
        AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.LoaderManager.class) {
            return ((AbstractC5110Fc.LoaderManager) abstractC5110FcAEQbTJ).AEQbTJ();
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.LoaderManager.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
    }
}
