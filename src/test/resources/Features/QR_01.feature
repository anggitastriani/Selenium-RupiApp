Feature: QR-01

  Scenario: TC-QR-004
    Given The user on login
    When The user log in with this username "testing2" password "Fadli798@"
    And The user click oke button
    And The user filling OTP
    And The user direct to the "QR Terima"
    And The user click riwayat button
    Then The Text Riwayat Should be Displayed

  Scenario: TC-QR-005
    Given The user on login
    When The user log in with this username "testing2" password "Fadli798@"
    And The user click oke button
    And The user filling OTP
    And The user direct to the "QR Terima"
    And The user click riwayat button
    And The user click pending button
    Then The Text Information Should be Displayed


  Scenario: TC-QR-006
    Given The user on login
    When The user log in with this username "testing2" password "Fadli798@"
    And The user click oke button
    And The user filling OTP
    And The user direct to the "QR Terima"
    And The user click riwayat button
   # Then The Text QR Terima should be displayed
    And The user click filter button
    And The user choose date for filtering
    Then The Date Text Should be Displayed
