package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.json.LexerState;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC5110Fc;
import o.C56455yG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ES implements EU {
    public AbstractC5110Fc AEQbTJ;
    public final EZ EZpvd;
    public int KWHzl;
    public final byte[] copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LexerState.values().length];
            try {
                iArr[LexerState.Initial.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LexerState.ArrayFirstValueOrEnd.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LexerState.ArrayNextValueOrEnd.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LexerState.ObjectFirstKeyOrEnd.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LexerState.ObjectNextKeyOrEnd.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[LexerState.ObjectFieldValue.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    public ES(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault = bArr;
        this.EZpvd = new EZ(null, null, 3, null);
    }

    @Override // o.EU
    public AbstractC5110Fc AEQbTJ() {
        AbstractC5110Fc abstractC5110FcValueOf = valueOf();
        this.AEQbTJ = null;
        this.EZpvd.OLrzqt();
        return abstractC5110FcValueOf;
    }

    @Override // o.EU
    public AbstractC5110Fc valueOf() {
        AbstractC5110Fc abstractC5110Fc = this.AEQbTJ;
        if (abstractC5110Fc != null) {
            return abstractC5110Fc;
        }
        AbstractC5110Fc abstractC5110FcCopydefault = copydefault();
        this.AEQbTJ = abstractC5110FcCopydefault;
        return abstractC5110FcCopydefault;
    }

    @Override // o.EU
    public void DbNXlk() {
        int iAEQbTJ = this.EZpvd.AEQbTJ();
        AEQbTJ();
        while (this.EZpvd.AEQbTJ() > iAEQbTJ) {
            AEQbTJ();
        }
    }

    public final AbstractC5110Fc copydefault() {
        try {
            switch (Application.AEQbTJ[this.EZpvd.KWHzl().ordinal()]) {
                case 1:
                    return values();
                case 2:
                    return fARcdN();
                case 3:
                    return ejfBZ();
                case 4:
                    return getFieldNames();
                case 5:
                    return getNewProxyInstance();
                case 6:
                    return fIwbmz();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (DeserializationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new DeserializationException(e2);
        }
    }

    public final AbstractC5110Fc getFieldNames() {
        java.lang.Character chAEQbTJ = AEQbTJ(true);
        if (chAEQbTJ != null && chAEQbTJ.charValue() == '}') {
            return EZpvd();
        }
        if (chAEQbTJ != null && chAEQbTJ.charValue() == '\"') {
            return fetchVPNInfo();
        }
        KWHzl(chAEQbTJ, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "}");
        throw new KotlinNothingValueException();
    }

    public final AbstractC5110Fc getNewProxyInstance() {
        java.lang.Character chAEQbTJ = AEQbTJ(true);
        if (chAEQbTJ != null && chAEQbTJ.charValue() == '}') {
            return EZpvd();
        }
        if (chAEQbTJ != null && chAEQbTJ.charValue() == ',') {
            EZpvd(AbstractJsonLexerKt.COMMA);
            AEQbTJ(true);
            return fetchVPNInfo();
        }
        KWHzl(chAEQbTJ, ",", "}");
        throw new KotlinNothingValueException();
    }

    public final AbstractC5110Fc fIwbmz() {
        java.lang.Character chAEQbTJ = AEQbTJ(true);
        if (chAEQbTJ != null && chAEQbTJ.charValue() == ':') {
            EZpvd(AbstractJsonLexerKt.COLON);
            this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$stateObjectFieldValue$1
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<LexerState> list) {
                    Intrinsics.checkNotNullParameter(list, "");
                    C56455yG.OLrzqt(list, LexerState.ObjectNextKeyOrEnd);
                }
            });
            return values();
        }
        KWHzl(chAEQbTJ, ":");
        throw new KotlinNothingValueException();
    }

    public final AbstractC5110Fc fARcdN() {
        java.lang.Character chAEQbTJ = AEQbTJ(true);
        if (chAEQbTJ != null && chAEQbTJ.charValue() == ']') {
            return OLrzqt();
        }
        this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$stateArrayFirstValueOrEnd$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<LexerState> list) {
                Intrinsics.checkNotNullParameter(list, "");
                C56455yG.OLrzqt(list, LexerState.ArrayNextValueOrEnd);
            }
        });
        return values();
    }

    public final AbstractC5110Fc ejfBZ() {
        java.lang.Character chAEQbTJ = AEQbTJ(true);
        if (chAEQbTJ != null && chAEQbTJ.charValue() == ']') {
            return OLrzqt();
        }
        if (chAEQbTJ != null && chAEQbTJ.charValue() == ',') {
            EZpvd(AbstractJsonLexerKt.COMMA);
            return values();
        }
        KWHzl(chAEQbTJ, ",", "]");
        throw new KotlinNothingValueException();
    }

    public final AbstractC5110Fc AuCTel() {
        EZpvd(AbstractJsonLexerKt.BEGIN_OBJ);
        this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$startObject$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<LexerState> list) {
                Intrinsics.checkNotNullParameter(list, "");
                C56455yG.copydefault(list, LexerState.ObjectFirstKeyOrEnd);
            }
        });
        return AbstractC5110Fc.ActionBar.OLrzqt;
    }

    public final AbstractC5110Fc EZpvd() {
        EZpvd(AbstractJsonLexerKt.END_OBJ);
        LexerState lexerStateKWHzl = this.EZpvd.KWHzl();
        boolean z = lexerStateKWHzl == LexerState.ObjectFirstKeyOrEnd || lexerStateKWHzl == LexerState.ObjectNextKeyOrEnd;
        int i = this.KWHzl;
        if (!z) {
            fail$default(this, "Unexpected close `}` encountered".toString(), i - 1, null, 4, null);
            throw new KotlinNothingValueException();
        }
        this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$endObject$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<LexerState> list) {
                Intrinsics.checkNotNullParameter(list, "");
                C56455yG.copydefault(list);
            }
        });
        return AbstractC5110Fc.PendingIntent.AEQbTJ;
    }

    public final AbstractC5110Fc fJNWhG() {
        EZpvd(AbstractJsonLexerKt.BEGIN_LIST);
        this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$startArray$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<LexerState> list) {
                Intrinsics.checkNotNullParameter(list, "");
                C56455yG.copydefault(list, LexerState.ArrayFirstValueOrEnd);
            }
        });
        return AbstractC5110Fc.Application.EZpvd;
    }

    public final AbstractC5110Fc OLrzqt() {
        EZpvd(AbstractJsonLexerKt.END_LIST);
        LexerState lexerStateKWHzl = this.EZpvd.KWHzl();
        boolean z = lexerStateKWHzl == LexerState.ArrayFirstValueOrEnd || lexerStateKWHzl == LexerState.ArrayNextValueOrEnd;
        int i = this.KWHzl;
        if (!z) {
            fail$default(this, "Unexpected close `]` encountered".toString(), i - 1, null, 4, null);
            throw new KotlinNothingValueException();
        }
        this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$endArray$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<LexerState> list) {
                Intrinsics.checkNotNullParameter(list, "");
                C56455yG.copydefault(list);
            }
        });
        return AbstractC5110Fc.Activity.AEQbTJ;
    }

    public final AbstractC5110Fc fetchVPNInfo() {
        char cDjBIcL = djBIcL();
        if (cDjBIcL == '\"') {
            java.lang.String strIsConnected = isConnected();
            this.EZpvd.AEQbTJ(new Function1<java.util.List<LexerState>, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$readName$1
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<LexerState> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<LexerState> list) {
                    Intrinsics.checkNotNullParameter(list, "");
                    C56455yG.OLrzqt(list, LexerState.ObjectFieldValue);
                }
            });
            return new AbstractC5110Fc.LoaderManager(strIsConnected);
        }
        KWHzl(java.lang.Character.valueOf(cDjBIcL), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        throw new KotlinNothingValueException();
    }

    public final AbstractC5110Fc values() {
        java.lang.Character chAEQbTJ = AEQbTJ(true);
        if (chAEQbTJ != null && chAEQbTJ.charValue() == '{') {
            return AuCTel();
        }
        if (chAEQbTJ != null && chAEQbTJ.charValue() == '[') {
            return fJNWhG();
        }
        if (chAEQbTJ != null && chAEQbTJ.charValue() == '\"') {
            return new AbstractC5110Fc.Dialog(isConnected());
        }
        if ((chAEQbTJ != null && chAEQbTJ.charValue() == 't') || ((chAEQbTJ != null && chAEQbTJ.charValue() == 'f') || (chAEQbTJ != null && chAEQbTJ.charValue() == 'n'))) {
            return AhwBna();
        }
        if (chAEQbTJ == null || chAEQbTJ.charValue() != '-') {
            yIU yiu = new yIU('0', '9');
            if (chAEQbTJ == null || !yiu.copydefault(chAEQbTJ.charValue())) {
                if (chAEQbTJ == null) {
                    return AbstractC5110Fc.TaskDescription.EZpvd;
                }
                KWHzl(chAEQbTJ, "{", "[", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, AbstractJsonLexerKt.NULL, "true", "false", "<number>");
                throw new KotlinNothingValueException();
            }
        }
        return AkhnZx();
    }

    public final AbstractC5110Fc AkhnZx() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Character chGEmmrt = gEmmrt();
        if (chGEmmrt != null && chGEmmrt.charValue() == '-') {
            sb.append(KWHzl());
        }
        AEQbTJ(sb);
        java.lang.Character chGEmmrt2 = gEmmrt();
        if (chGEmmrt2 != null && chGEmmrt2.charValue() == '.') {
            sb.append(KWHzl());
            AEQbTJ(sb);
        }
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Character>) ((java.lang.Iterable<? extends java.lang.Object>) EO.copydefault), gEmmrt())) {
            sb.append(KWHzl());
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Character>) ((java.lang.Iterable<? extends java.lang.Object>) EO.AEQbTJ), gEmmrt())) {
                sb.append(KWHzl());
            }
            AEQbTJ(sb);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        boolean z = string.length() > 0;
        int i = this.KWHzl;
        if (!z) {
            fail$default(this, ("Invalid number, expected `-` || 0..9, found `" + gEmmrt() + '`').toString(), i, null, 4, null);
            throw new KotlinNothingValueException();
        }
        return new AbstractC5110Fc.Fragment(string);
    }

    public final void AEQbTJ(java.lang.Appendable appendable) throws java.io.IOException {
        while (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Character>) ((java.lang.Iterable<? extends java.lang.Object>) EO.EZpvd), gEmmrt())) {
            appendable.append(KWHzl());
        }
    }

    public final java.lang.String isConnected() {
        EZpvd('\"');
        int i = this.KWHzl;
        char cDjBIcL = djBIcL();
        boolean z = false;
        while (cDjBIcL != '\"') {
            if (cDjBIcL != '\\') {
                if (EO.copydefault(cDjBIcL)) {
                    fail$default(this, "Unexpected control character: `" + cDjBIcL + '`', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                this.KWHzl++;
            } else {
                KWHzl();
                char cKWHzl = KWHzl();
                if (cKWHzl == 'u') {
                    int i2 = this.KWHzl;
                    int i3 = i2 + 4;
                    if (i3 >= this.copydefault.length) {
                        fail$default(this, "Unexpected EOF reading escaped unicode string", i2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    this.KWHzl = i3;
                } else if (cKWHzl != '\\' && cKWHzl != '/' && cKWHzl != '\"' && cKWHzl != 'b' && cKWHzl != 'f' && cKWHzl != 'r' && cKWHzl != 'n' && cKWHzl != 't') {
                    fail$default(this, "Invalid escape character: `" + cKWHzl + '`', this.KWHzl - 1, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z = true;
            }
            cDjBIcL = djBIcL();
        }
        java.lang.String strDecodeToString$default = C59449zhJ.decodeToString$default(this.copydefault, i, this.KWHzl, false, 4, null);
        EZpvd('\"');
        if (!z) {
            return strDecodeToString$default;
        }
        try {
            return EO.copydefault(strDecodeToString$default);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Invalid escaped string";
            }
            fail$default(this, message, i - 1, null, 4, null);
            throw new KotlinNothingValueException();
        }
    }

    public final AbstractC5110Fc AhwBna() {
        char cDjBIcL = djBIcL();
        if (cDjBIcL == 't') {
            return OLrzqt("true", new AbstractC5110Fc.StateListAnimator(true));
        }
        if (cDjBIcL == 'f') {
            return OLrzqt("false", new AbstractC5110Fc.StateListAnimator(false));
        }
        if (cDjBIcL == 'n') {
            return OLrzqt(AbstractJsonLexerKt.NULL, AbstractC5110Fc.FragmentManager.KWHzl);
        }
        fail$default(this, "Unable to handle keyword starting with '" + cDjBIcL + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final AbstractC5110Fc OLrzqt(java.lang.String str, AbstractC5110Fc abstractC5110Fc) {
        OLrzqt(str);
        return abstractC5110Fc;
    }

    public static /* synthetic */ java.lang.Character nextNonWhitespace$default(ES es, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return es.AEQbTJ(z);
    }

    public final java.lang.Character AEQbTJ(boolean z) {
        while (true) {
            java.lang.Character chGEmmrt = gEmmrt();
            if (chGEmmrt == null || !CharsKt__CharJVMKt.EZpvd(chGEmmrt.charValue())) {
                break;
            }
            this.KWHzl++;
        }
        return z ? gEmmrt() : java.lang.Character.valueOf(KWHzl());
    }

    public final void EZpvd(char c) {
        char c2 = (char) this.copydefault[this.KWHzl];
        boolean z = c2 == c;
        int i = this.KWHzl;
        if (z) {
            this.KWHzl++;
            return;
        }
        fail$default(this, ("Unexpected char `" + c2 + "` expected `" + c + '`').toString(), i, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final java.lang.Byte AYXKKw() {
        return yDV.AEQbTJ(this.copydefault, this.KWHzl);
    }

    public final java.lang.Character gEmmrt() {
        java.lang.Byte bAYXKKw = AYXKKw();
        if (bAYXKKw != null) {
            return java.lang.Character.valueOf((char) bAYXKKw.byteValue());
        }
        return null;
    }

    public final char djBIcL() {
        java.lang.Character chGEmmrt = gEmmrt();
        if (chGEmmrt != null) {
            return chGEmmrt.charValue();
        }
        throw new java.lang.IllegalStateException("Unexpected EOF");
    }

    public final char KWHzl() {
        char cDjBIcL = djBIcL();
        this.KWHzl++;
        return cDjBIcL;
    }

    public final java.lang.Void KWHzl(java.lang.Character ch, java.lang.String... strArr) {
        java.lang.String str = strArr.length > 1 ? " one of" : "";
        fail$default(this, "found `" + ch + "`, expected" + str + ' ' + yDV.joinToString$default(strArr, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.serde.json.JsonLexer$unexpectedToken$formatted$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(@NotNull String str2) {
                Intrinsics.checkNotNullParameter(str2, "");
                return '`' + str2 + '`';
            }
        }, 30, (java.lang.Object) null), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ java.lang.Void fail$default(ES es, java.lang.String str, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = es.KWHzl;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return es.copydefault(str, i, th);
    }

    public final java.lang.Void copydefault(java.lang.String str, int i, java.lang.Throwable th) {
        throw new DeserializationException("Unexpected JSON token at offset " + i + "; " + str, th);
    }

    public static /* synthetic */ void lexerCheck$default(ES es, boolean z, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = es.KWHzl;
        }
        int i3 = i;
        if (z) {
            return;
        }
        fail$default(es, function0.invoke().toString(), i3, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void OLrzqt(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            EZpvd(str.charAt(i));
        }
    }
}
