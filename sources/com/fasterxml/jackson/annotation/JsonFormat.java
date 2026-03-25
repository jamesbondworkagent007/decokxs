package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;
import o.yCN;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    /* JADX INFO: loaded from: classes21.dex */
    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    /* JADX INFO: loaded from: classes21.dex */
    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    Shape AEQbTJ() default Shape.ANY;

    Feature[] AhwBna() default {};

    String EZpvd() default "##default";

    OptBoolean KWHzl() default OptBoolean.DEFAULT;

    String OLrzqt() default "";

    String copydefault() default "##default";

    Feature[] gEmmrt() default {};

    /* JADX INFO: loaded from: classes21.dex */
    public static class StateListAnimator {
        public static final StateListAnimator KWHzl = new StateListAnimator(0, 0);
        public final int AEQbTJ;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static StateListAnimator EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ + this.copydefault;
        }

        public StateListAnimator(int i, int i2) {
            this.copydefault = i;
            this.AEQbTJ = i2;
        }

        public static StateListAnimator OLrzqt(JsonFormat jsonFormat) {
            return OLrzqt(jsonFormat.gEmmrt(), jsonFormat.AhwBna());
        }

        public static StateListAnimator OLrzqt(Feature[] featureArr, Feature[] featureArr2) {
            int iOrdinal = 0;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            int iOrdinal2 = 0;
            for (Feature feature2 : featureArr2) {
                iOrdinal2 |= 1 << feature2.ordinal();
            }
            return new StateListAnimator(iOrdinal, iOrdinal2);
        }

        public StateListAnimator KWHzl(StateListAnimator stateListAnimator) {
            if (stateListAnimator == null) {
                return this;
            }
            int i = stateListAnimator.AEQbTJ;
            int i2 = stateListAnimator.copydefault;
            if (i == 0 && i2 == 0) {
                return this;
            }
            int i3 = this.copydefault;
            if (i3 == 0 && this.AEQbTJ == 0) {
                return stateListAnimator;
            }
            int i4 = ((~i) & i3) | i2;
            int i5 = this.AEQbTJ;
            int i6 = i | ((~i2) & i5);
            return (i4 == i3 && i6 == i5) ? this : new StateListAnimator(i4, i6);
        }

        public StateListAnimator AEQbTJ(Feature... featureArr) {
            int iOrdinal = this.copydefault;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this.copydefault ? this : new StateListAnimator(iOrdinal, this.AEQbTJ);
        }

        public StateListAnimator copydefault(Feature... featureArr) {
            int iOrdinal = this.AEQbTJ;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this.AEQbTJ ? this : new StateListAnimator(this.copydefault, iOrdinal);
        }

        public Boolean AEQbTJ(Feature feature) {
            int iOrdinal = 1 << feature.ordinal();
            if ((this.AEQbTJ & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & this.copydefault) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public String toString() {
            if (this == KWHzl) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.copydefault), Integer.valueOf(this.AEQbTJ));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return stateListAnimator.copydefault == this.copydefault && stateListAnimator.AEQbTJ == this.AEQbTJ;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Value implements Serializable {
        private static final Value EMPTY = new Value();
        private static final long serialVersionUID = 1;
        private final StateListAnimator _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final Value empty() {
            return EMPTY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator getFeatures() {
            return this._features;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Boolean getLenient() {
            return this._lenient;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Locale getLocale() {
            return this._locale;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getPattern() {
            return this._pattern;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Shape getShape() {
            return this._shape;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean hasLenient() {
            return this._lenient != null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean hasLocale() {
            return this._locale != null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public Value() {
            this("", Shape.ANY, "", "", StateListAnimator.EZpvd(), (Boolean) null);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.OLrzqt(), jsonFormat.AEQbTJ(), jsonFormat.EZpvd(), jsonFormat.copydefault(), StateListAnimator.OLrzqt(jsonFormat), jsonFormat.KWHzl().asBoolean());
        }

        public Value(String str, Shape shape, String str2, String str3, StateListAnimator stateListAnimator, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, stateListAnimator, bool);
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, StateListAnimator stateListAnimator, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = null;
            this._features = stateListAnimator == null ? StateListAnimator.EZpvd() : stateListAnimator;
            this._lenient = bool;
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, StateListAnimator stateListAnimator, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = stateListAnimator == null ? StateListAnimator.EZpvd() : stateListAnimator;
            this._lenient = bool;
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, StateListAnimator stateListAnimator) {
            this(str, shape, locale, str2, timeZone, stateListAnimator, null);
        }

        @Deprecated
        public Value(String str, Shape shape, String str2, String str3, StateListAnimator stateListAnimator) {
            this(str, shape, str2, str3, stateListAnimator, (Boolean) null);
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, StateListAnimator stateListAnimator) {
            this(str, shape, locale, timeZone, stateListAnimator, (Boolean) null);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value valueWithOverrides : valueArr) {
                if (valueWithOverrides != null) {
                    if (value != null) {
                        valueWithOverrides = value.withOverrides(valueWithOverrides);
                    }
                    value = valueWithOverrides;
                }
            }
            return value;
        }

        public static final Value from(JsonFormat jsonFormat) {
            return jsonFormat == null ? EMPTY : new Value(jsonFormat);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            StateListAnimator stateListAnimatorKWHzl;
            String str;
            TimeZone timeZone;
            if (value == null || value == (value2 = EMPTY) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value._pattern;
            if (str2 == null || str2.isEmpty()) {
                str2 = this._pattern;
            }
            String str3 = str2;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            StateListAnimator stateListAnimator = this._features;
            if (stateListAnimator == null) {
                stateListAnimatorKWHzl = value._features;
            } else {
                stateListAnimatorKWHzl = stateListAnimator.KWHzl(value._features);
            }
            StateListAnimator stateListAnimator2 = stateListAnimatorKWHzl;
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str4 = value._timezoneStr;
            if (str4 == null || str4.isEmpty()) {
                str = this._timezoneStr;
                timeZone = this._timezone;
            } else {
                timeZone = value._timezone;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, stateListAnimator2, bool2);
        }

        public static Value forPattern(String str) {
            return new Value(str, null, null, null, null, StateListAnimator.EZpvd(), null);
        }

        public static Value forShape(Shape shape) {
            return new Value("", shape, null, null, null, StateListAnimator.EZpvd(), null);
        }

        public static Value forLeniency(boolean z) {
            return new Value("", null, null, null, null, StateListAnimator.EZpvd(), Boolean.valueOf(z));
        }

        public Value withPattern(String str) {
            return new Value(str, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withShape(Shape shape) {
            return shape == this._shape ? this : new Value(this._pattern, shape, this._locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withLocale(Locale locale) {
            return new Value(this._pattern, this._shape, locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this._pattern, this._shape, this._locale, null, timeZone, this._features, this._lenient);
        }

        public Value withLenient(Boolean bool) {
            return bool == this._lenient ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, bool);
        }

        public Value withFeature(Feature feature) {
            StateListAnimator stateListAnimatorAEQbTJ = this._features.AEQbTJ(feature);
            return stateListAnimatorAEQbTJ == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, stateListAnimatorAEQbTJ, this._lenient);
        }

        public Value withoutFeature(Feature feature) {
            StateListAnimator stateListAnimatorCopydefault = this._features.copydefault(feature);
            return stateListAnimatorCopydefault == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, stateListAnimatorCopydefault, this._lenient);
        }

        public boolean isLenient() {
            return Boolean.TRUE.equals(this._lenient);
        }

        public String timeZoneAsString() {
            TimeZone timeZone = this._timezone;
            return timeZone != null ? timeZone.getID() : this._timezoneStr;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZoneOLrzqt = yCN.OLrzqt(str);
            this._timezone = timeZoneOLrzqt;
            return timeZoneOLrzqt;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasTimeZone() {
            String str;
            return (this._timezone == null && ((str = this._timezoneStr) == null || str.isEmpty())) ? false : true;
        }

        public Boolean getFeature(Feature feature) {
            return this._features.AEQbTJ(feature);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = iHashCode + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return iHashCode2 ^ this._features.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (this._shape == value._shape && this._features.equals(value._features)) {
                return _equal(this._lenient, value._lenient) && _equal(this._timezoneStr, value._timezoneStr) && _equal(this._pattern, value._pattern) && _equal(this._timezone, value._timezone) && _equal(this._locale, value._locale);
            }
            return false;
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }
    }
}
