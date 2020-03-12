package katas

import "testing"

func TestForI(t *testing.T) {
	tests := []struct {
		in  int
		out string
	}{
		{1, "I"},
	}

	for _, test := range tests {
		actual := SomeFunction(test.in)
		
		if actual != test.out {
			t.Errorf("Expected '%s' for input %d, got '%s'", test.out, test.in, actual)
		}
	}
}
